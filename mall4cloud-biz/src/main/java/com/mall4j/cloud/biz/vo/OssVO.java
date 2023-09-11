package com.mall4j.cloud.biz.vo;

import lombok.Data;

import java.util.List;

/**
 * @author wuKeFan
 * @date 2020/9/12
 */
@Data
public class OssVO {

    private String accessid;

    private String policy;

    private String signature;

    private String dir;

    private String host;

    private Integer expire;

    private String fileName;

    private String actionUrl;

    /**
     * url列表--minio中一条链接对应一个上传的文件
     * @return
     */
    private List<OssVO> ossList;

}
