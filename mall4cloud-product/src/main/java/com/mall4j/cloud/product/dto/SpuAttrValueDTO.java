package com.mall4j.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 商品规格属性关联信息DTO
 *
 * @author wuKeFan
 * @date 2020-10-28 15:27:24
 */
@Data
public class SpuAttrValueDTO{
    private static final long serialVersionUID = 1L;

    @Schema(description = "商品属性值关联信息id" )
    private Long spuAttrValueId;

    @Schema(description = "商品id" )
    private Long spuId;

    @Schema(description = "规格属性id" )
    private Long attrId;

    @Schema(description = "规格属性名称" )
    private String attrName;

    @Schema(description = "规格属性值id" )
    private Long attrValueId;

    @Schema(description = "规格属性值名称" )
    private String attrValueName;

}
