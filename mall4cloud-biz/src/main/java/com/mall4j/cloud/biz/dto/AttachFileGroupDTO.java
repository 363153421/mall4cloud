package com.mall4j.cloud.biz.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * DTO
 *
 * @author wuKeFan
 * @date 2020-12-04 16:15:02
 */
@Data
public class AttachFileGroupDTO{
    private static final long serialVersionUID = 1L;

    @Schema()
    private Long attachFileGroupId;

    @Schema(description = "店铺id" )
    private Long shopId;

    @Schema(description = "分组名称" )
    private String name;

}
