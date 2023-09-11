package com.mall4j.cloud.order.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 订单下的每个店铺
 *
 * @author wuKeFan
 */
@Data
public class OrderShopVO implements Serializable {

    @Schema(description = "店铺id" , required = true)
    private Long shopId;

    @Schema(description = "店铺名称" , required = true)
    private String shopName;

    @Schema(description = "商品总值" , required = true)
    private Long total;

    @Schema(description = "商品总数" , required = true)
    private Integer totalNum;


    @Schema(description = "地址Dto" , required = true)
    private OrderAddrVO orderAddr;

    @Schema(description = "产品信息" , required = true)
    private List<OrderItemVO> orderItems;

    @Schema(description = "订单创建时间" , required = true)
    private Date createTime;

    @Schema(description = "订单付款时间" , required = false)
    private Date payTime;

    @Schema(description = "订单发货时间" , required = false)
    private Date deliveryTime;

    @Schema(description = "订单完成时间" , required = false)
    private Date finallyTime;

    @Schema(description = "订单取消时间" , required = false)
    private Date cancelTime;

    @Schema(description = "订单更新时间" , required = false)
    private Date updateTime;

    @Schema(description = "配送类型 3：无需快递" , required = true)
    private Integer deliveryType;

    @Schema(description = "订单状态" , required = true)
    private Integer status;

}
