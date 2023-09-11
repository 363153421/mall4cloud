package com.mall4j.cloud.product.dto.shopcart;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author wuKeFan
 * @date 2021-02-03 15:47:32
 */
@Data
public class CheckShopCartItemDTO {

    @NotNull
    @Schema(description = "购物车ID" , required = true)
    private Long shopCartItemId;

    @NotNull
    @Schema(description = "商品是否勾选 1:勾选 0:未勾选" )
    private Integer isChecked;

}
