package com.mall4j.cloud.biz.util;

import io.minio.*;
import io.minio.errors.*;
import io.minio.messages.Bucket;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * minio存储桶工具类
 *
 * @author wuKeFan
 * @date 2023-09-08 14:08:10
 */
public class MinioUtil {

    public static void main(String[] args) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        setBucketPublicPolicy("http://43.139.188.228:9000", "minioadmin", "minioadmin", "mall4cloud");
    }

    /**
     * 判断桶是否存在
     */
    public static boolean bucketExists(String url, String accessKey, String secretKey, String bucketName)
            throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        MinioClient minioClient = MinioClient.builder().endpoint(url)
                .credentials(accessKey, secretKey).build();
        return minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build());
    }

    /**
     * 添加存储桶
     */
    public static void makeBucket(String url, String accessKey, String secretKey, String bucketName, String region, boolean objectLock)
            throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        MinioClient minioClient = MinioClient.builder().endpoint(url)
                .credentials(accessKey, secretKey).build();
        minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucketName).region(region).objectLock(objectLock).build());
    }

    /**
     * 指定地区添加存储桶
     */
    public static void makeBucket(String url, String accessKey, String secretKey, String bucketName)
            throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        MinioClient minioClient = MinioClient.builder().endpoint(url)
                .credentials(accessKey, secretKey).build();
        minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
    }

    /**
     * 指定地区添加存储桶并锁定对象
     */
    public static void makeBucket(String url, String accessKey, String secretKey, String bucketName, String region)
            throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        MinioClient minioClient = MinioClient.builder().endpoint(url)
                .credentials(accessKey, secretKey).build();
        minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucketName).region(region).build());
    }

    /**
     * 删除存储桶
     */
    public static void removeBucket(String url, String accessKey, String secretKey, String bucketName)
            throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        MinioClient minioClient = MinioClient.builder().endpoint(url)
                .credentials(accessKey, secretKey).build();
        minioClient.removeBucket(RemoveBucketArgs.builder().bucket(bucketName).build());
    }

    /**
     * 设置桶公有
     */
    public static void setBucketPublicPolicy(String url, String accessKey, String secretKey, String bucketName)
            throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        MinioClient minioClient = MinioClient.builder().endpoint(url)
                .credentials(accessKey, secretKey).build();
        String sb = "{\"Version\":\"2012-10-17\"," +
                "\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":" +
                "{\"AWS\":[\"*\"]},\"Action\":[\"s3:ListBucket\",\"s3:ListBucketMultipartUploads\"," +
                "\"s3:GetBucketLocation\"],\"Resource\":[\"arn:aws:s3:::" + bucketName +
                "\"]},{\"Effect\":\"Allow\",\"Principal\":{\"AWS\":[\"*\"]},\"Action\":[\"s3:PutObject\",\"s3:AbortMultipartUpload\",\"s3:DeleteObject\",\"s3:GetObject\",\"s3:ListMultipartUploadParts\"],\"Resource\":[\"arn:aws:s3:::" +
                bucketName +
                "/*\"]}]}";
        minioClient.setBucketPolicy(
                SetBucketPolicyArgs.builder()
                        .bucket(bucketName)
                        .config(sb)
                        .build());
    }

    /**
     * 设置桶私有
     */
    public static void setBucketPrivatePolicy(String url, String accessKey, String secretKey, String bucketName)
            throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        MinioClient minioClient = MinioClient.builder().endpoint(url)
                .credentials(accessKey, secretKey).build();
        minioClient.setBucketPolicy(
                SetBucketPolicyArgs.builder().bucket(bucketName)
                        .config(
                                "{\"Version\":\"2012-10-17\",\"Statement\":[]}"
                        )
                        .build());
    }

    /**
     * 查询存储桶信息列表
     */
    public static List<Bucket> listBuckets(String url, String accessKey, String secretKey) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        MinioClient minioClient = MinioClient.builder().endpoint(url)
                .credentials(accessKey, secretKey).build();
        return minioClient.listBuckets();
    }

}
