package com.mall4j.cloud.biz.vo;

import com.mall4j.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 上传文件记录表VO
 *
 * @author wuKeFan
 * @date 2020-11-21 10:21:40
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class AttachFileVO extends BaseVO {
    private static final long serialVersionUID = 1L;

    @Schema()
    private Long fileId;

    @Schema(description = "文件路径" )
    private String filePath;

    @Schema(description = "文件类型" )
    private String fileType;

    @Schema(description = "文件名" )
    private String fileName;

    @Schema(description = "文件大小" )
    private Integer fileSize;

    @Schema(description = "店铺id" )
    private Long shopId;

    @Schema(description = "文件 1:图片 2:视频 3:文件" )
    private Integer type;

	@Schema(description = "分组id" )
	private Long attachFileGroupId;

}
