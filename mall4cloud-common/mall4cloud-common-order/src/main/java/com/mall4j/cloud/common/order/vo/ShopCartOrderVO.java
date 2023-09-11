package com.mall4j.cloud.common.order.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 单个店铺的订单信息
 * @author wuKeFan
 */
@Data
public class ShopCartOrderVO implements Serializable{

    @Schema(description = "店铺id" , required = true)
    private Long shopId;

    @Schema(description = "店铺名称" , required = true)
    private String shopName;

    @Schema(description = "商品总值" , required = true)
    private Long total;

    @Schema(description = "购物车商品" , required = true)
    private List<ShopCartItemVO> shopCartItemVO;

    @Schema(description = "商品总数" , required = true)
    private Integer totalCount;

}
