package com.mall4j.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 商品详情信息DTO
 *
 * @author wuKeFan
 * @date 2020-10-28 15:27:24
 */
@Data
public class SpuDetailDTO{
    private static final long serialVersionUID = 1L;

    @Schema(description = "商品id" )
    private Long spuId;

    @Schema(description = "商品详情" )
    private String detail;

}
