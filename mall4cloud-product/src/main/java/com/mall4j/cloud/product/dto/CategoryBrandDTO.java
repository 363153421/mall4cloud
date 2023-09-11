package com.mall4j.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 品牌分类关联信息DTO
 *
 * @author wuKeFan
 * @date 2020-10-28 15:27:24
 */
@Data
public class CategoryBrandDTO{
    private static final long serialVersionUID = 1L;

    @Schema()
    private Long id;

    @Schema(description = "品牌id" )
    private Long brandId;

    @Schema(description = "分类id" )
    private Long categoryId;

}
