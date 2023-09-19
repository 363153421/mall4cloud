package com.mall4j.cloud.biz.util;

import io.minio.*;
import io.minio.errors.*;
import io.minio.http.Method;
import io.minio.messages.*;
import okhttp3.*;
import org.apache.commons.io.FileUtils;
import org.springframework.util.ObjectUtils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * minio对象操作工具类
 *
 * @author wuKeFan
 * @date 2023-09-19 09:45:43
 */
public class MinioObjectUtil {

    /**
     * minio地址(自己填写)
     */
    private static final String url = "http://43.139.188.228:9000";

    /**
     * minio用户名(自己填写)
     */
    private static final String accessKey = "minioadmin";

    /**
     * minio密码(自己填写)
     */
    private static final String secretKey = "minioadmin";

    private static final MinioClient minioClient;

    static {
        minioClient = MinioClient.builder().endpoint(url)
                .credentials(accessKey, secretKey).build();
    }

    /**
     * 上传文件(InputStream上传)
     *
     * @param file 需要上传的文件
     * @param bucket 桶名称
     */
    public static void putObject(File file ,String bucket) throws IOException, ServerException, InsufficientDataException, ErrorResponseException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        InputStream inputStream = Files.newInputStream(file.toPath());
        minioClient.putObject(
                PutObjectArgs.builder().bucket(bucket).object(file.getName()).stream(
                                inputStream, inputStream.available(), -1)
                        .build());
        inputStream.close();
    }

    /**
     * 上传文件(InputStream使用SSE-C加密上传)
     *
     * @param file 需要上传的文件
     * @param bucket 桶名称
     */
    public static void putObject(File file ,String bucket, ServerSideEncryption ssec) throws IOException, ServerException, InsufficientDataException, ErrorResponseException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        InputStream inputStream = Files.newInputStream(file.toPath());
        minioClient.putObject(
                PutObjectArgs.builder().bucket("mall4cloud").object(file.getName()).stream(
                                inputStream, inputStream.available(), -1)
                        .sse(ssec)
                        .build());
        inputStream.close();
    }

    /**
     * 上传文件(InputStream上传文件，添加自定义元数据及消息头)
     *
     * @param file 需要上传的文件
     * @param bucket 桶名称
     */
    public static void putObject(File file ,String bucket, Map<String, String> headers) throws IOException, ServerException, InsufficientDataException, ErrorResponseException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        InputStream inputStream = Files.newInputStream(file.toPath());
        Map<String, String> userMetadata = new HashMap<>();
        minioClient.putObject(
                PutObjectArgs.builder().bucket(bucket).object(file.getName()).stream(
                                inputStream, inputStream.available(), -1)
                        .headers(headers)
                        .userMetadata(userMetadata)
                        .build());
        inputStream.close();
    }

    /**
     * 获取文件
     *
     * @param bucket 桶名称
     * @param filename 文件名
     * @param targetPath 存储的路径
     */
    public static void getObject(String bucket, String filename, String targetPath) throws IOException, ServerException, InsufficientDataException, ErrorResponseException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        InputStream stream =
                minioClient.getObject(
                        GetObjectArgs.builder().bucket(bucket).object(filename).build());
        // 读流
        File targetFile = new File(targetPath);
        FileUtils.copyInputStreamToFile(stream, targetFile);
        stream.close();
    }

    /**
     * 下载文件
     *
     * @param bucket 桶名称
     * @param filename 文件名
     * @param targetPath 存储的路径
     */
    public static void downloadObject(String bucket, String filename, String targetPath) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        minioClient.downloadObject(
                DownloadObjectArgs.builder()
                        .bucket(bucket)
                        .object(filename)
                        .filename(targetPath)
                        .build());
    }

    /**
     * 获取文件url
     *
     * @param bucket 桶名称
     * @param filename 文件名
     */
    public static String getPresignedObjectUrl(String bucket, String filename) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        return minioClient.getPresignedObjectUrl(
                GetPresignedObjectUrlArgs.builder()
                        .method(Method.GET)
                        .bucket(bucket)
                        .object(filename)
                        .expiry(60 * 60 * 24)
                        .build());
    }

    /**
     * 通过 SQL 表达式选择对象的内容
     *
     * @param data 上传的数据
     * @param bucket 桶名称
     * @param filename 文件名
     */
    public static String selectObjectContent(byte[] data, String bucket, String filename) throws IOException, ServerException, InsufficientDataException, ErrorResponseException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        // 1. 上传一个文件
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        minioClient.putObject(
                PutObjectArgs.builder().bucket(bucket).object(filename).stream(
                                byteArrayInputStream, data.length, -1)
                        .build());
        // 调用SQL表达式获取对象
        String sqlExpression = "select * from S3Object";
        InputSerialization is =
                new InputSerialization(null, false, null, null, FileHeaderInfo.USE, null, null, null);
        OutputSerialization os =
                new OutputSerialization(null, null, null, QuoteFields.ASNEEDED, null);
        SelectResponseStream stream =
                minioClient.selectObjectContent(
                        SelectObjectContentArgs.builder()
                                .bucket(bucket)
                                .object(filename)
                                .sqlExpression(sqlExpression)
                                .inputSerialization(is)
                                .outputSerialization(os)
                                .requestProgress(true)
                                .build());

        byte[] buf = new byte[512];
        int bytesRead = stream.read(buf, 0, buf.length);
        return new String(buf, 0, bytesRead, StandardCharsets.UTF_8);
    }

    /**
     * 设置并获取Post策略
     *
     * @param bucket 桶名
     */
    public static Map<String, String> setPostPolicy(String bucket) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        // 为存储桶创建一个上传策略，过期时间为7天
        PostPolicy policy = new PostPolicy(bucket, ZonedDateTime.now().plusDays(7));
        // 设置一个参数key，值为上传对象的名称
        policy.addEqualsCondition("key", bucket);
        // 添加Content-Type以"image/"开头，表示只能上传照片
        policy.addStartsWithCondition("Content-Type", "image/");
        // 设置上传文件的大小 64kiB to 10MiB.
        policy.addContentLengthRangeCondition(64 * 1024, 10 * 1024 * 1024);
        return minioClient.getPresignedPostFormData(policy);
    }

    /**
     * 使用Post上传
     *
     * @param formData Post策略
     * @param url minio服务器地址
     * @param bucket 桶名
     * @param path 本地文件地址
     */
    public static boolean uploadByHttp(Map<String, String> formData, String url, String bucket, String path) throws IOException {
        // 创建MultipartBody对象
        MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
        multipartBuilder.setType(MultipartBody.FORM);
        for (Map.Entry<String, String> entry : formData.entrySet()) {
            multipartBuilder.addFormDataPart(entry.getKey(), entry.getValue());
        }
        multipartBuilder.addFormDataPart("key", bucket);
        multipartBuilder.addFormDataPart("Content-Type", "image/png");
        multipartBuilder.addFormDataPart(
                "file", "my-objectname", RequestBody.create(new File(path), null));
        // 模拟第三方，使用OkHttp调用Post上传对象
        Request request =
                new Request.Builder()
                        .url(url + "/" + bucket)
                        .post(multipartBuilder.build())
                        .build();
        OkHttpClient httpClient = new OkHttpClient().newBuilder().build();
        Response response = httpClient.newCall(request).execute();
        return response.isSuccessful();
    }

    /**
     * 对象拷贝
     *
     * @param sourceBucket 源对象桶
     * @param sourceFilename 源文件名
     * @param targetBucket 目标对象桶
     * @param targetFilename 目标文件名
     */
    public static void copyObject(String sourceBucket, String sourceFilename, String targetBucket, String targetFilename) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        minioClient.copyObject(
                CopyObjectArgs.builder()
                        .bucket(targetBucket)
                        .object(targetFilename)
                        .source(CopySource.builder()
                                        .bucket(sourceBucket)
                                        .object(sourceFilename)
                                        .build())
                        .build());
    }

    /**
     * 删除单个对象
     *
     * @param bucket 桶名称
     * @param filename 文件名
     */
    public static void removeObject(String bucket, String filename) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        minioClient.removeObject(
                RemoveObjectArgs.builder().bucket(bucket).object(filename).build());
    }

    /**
     * 删除指定版本号的对象
     *
     * @param bucket 桶名称
     * @param filename 文件名
     * @param versionId 版本号
     */
    public static void removeObject(String bucket, String filename, String versionId) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        //
        minioClient.removeObject(
                RemoveObjectArgs.builder()
                        .bucket(bucket)
                        .object(filename)
                        .versionId(versionId)
                        .build());
    }

    /**
     * 删除多个文件
     *
     * @param bucket 桶名称
     * @param filenames 文件名列表
     * @return 返回每个文件的执行情况
     */
    public static Iterable<Result<DeleteError>> removeObjects(String bucket, List<String> filenames){
        if (ObjectUtils.isEmpty(filenames)) {
            return new LinkedList<>();
        }
        // 7. 删除多个文件
        List<DeleteObject> objects = new LinkedList<>();
        filenames.forEach(filename-> objects.add(new DeleteObject(filename)));
        return minioClient.removeObjects(
                RemoveObjectsArgs.builder().bucket(bucket).objects(objects).build());
    }

    public static void main(String[] args) {

    }

}
