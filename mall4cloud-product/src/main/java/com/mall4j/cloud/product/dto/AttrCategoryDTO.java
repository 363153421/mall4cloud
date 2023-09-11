package com.mall4j.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 属性与属性分组关联信息DTO
 *
 * @author wuKeFan
 * @date 2020-11-23 16:20:01
 */
@Data
public class AttrCategoryDTO{
    private static final long serialVersionUID = 1L;

    @Schema(description = "属性与分类关联id" )
    private Long attrCategoryId;

    @Schema(description = "分类id" )
    private Long categoryId;

    @Schema(description = "属性id" )
    private Long attrId;

}
