package com.mall4j.cloud.common.order.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * 多个店铺订单合并在一起的合并类
 * "/confirm" 使用
 * @author wuKeFan
 */
@Data
public class ShopCartOrderMergerVO {

    @Schema(description = "商品总值" , required = true)
    private Long total;

    @Schema(description = "商品总数" , required = true)
    private Integer totalCount;

    @Schema(description = "配送类型 ：无需快递" )
    private Integer dvyType;

    @Schema(description = "过滤掉的商品项" , required = true)
    private List<ShopCartItemVO> filterShopItems;

    @Schema(description = "每个店铺的订单信息" , required = true)
    List<ShopCartOrderVO> shopCartOrders;

    @Schema(description = "用户地址" )
    private UserAddrVO userAddr;

}
