package com.mall4j.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 库存锁定信息DTO
 *
 * @author wuKeFan
 * @date 2020-12-22 16:12:10
 */
@Data
public class SkuStockLockDTO{
    private static final long serialVersionUID = 1L;

    @Schema(description = "id" )
    private Long id;

    @Schema(description = "商品id" )
    private Long spuId;

    @Schema(description = "sku id" )
    private Long skuId;

    @Schema(description = "订单id" )
    private Long orderId;

    @Schema(description = "锁定库存数量" )
    private Integer count;

    @Schema(description = "状态-1已解锁 0待确定 1已锁定" )
    private Integer status;

}
