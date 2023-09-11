package com.mall4j.cloud.biz.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 上传文件记录表
 *
 * @author wuKeFan
 * @date 2020-11-21 10:21:40
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class AttachFile extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long fileId;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件大小
     */
    private Integer fileSize;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 文件 1:图片 2:视频 3:文件
     */
    private Integer type;

	/**
	 * 文件分组id（0：默认为所有）
	 */
	private Long attachFileGroupId;

}
