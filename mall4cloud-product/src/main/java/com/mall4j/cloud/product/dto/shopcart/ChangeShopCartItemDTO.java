package com.mall4j.cloud.product.dto.shopcart;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author wuKeFan
 * @date 2020-11-20 15:47:32
 */
@Data
public class ChangeShopCartItemDTO {

    @Schema(description = "购物车ID" , required = true)
    private Long shopCartItemId;

    @NotNull(message = "商品ID不能为空")
    @Schema(description = "商品ID" , required = true)
    private Long spuId;

    @Schema(description = "旧的skuId 如果传过来说明在变更sku" , required = true)
    private Long oldSkuId;

    @NotNull(message = "skuId不能为空")
    @Schema(description = "skuId" , required = true)
    private Long skuId;

    @Schema(description = "店铺ID，前端不用传该字段" )
    private Long shopId;

    @NotNull(message = "商品个数不能为空")
    @Schema(description = "商品个数" , required = true)
    private Integer count;

    @Schema(description = "商品是否勾选 true：勾选 " )
    private Boolean isCheck;

}
