package com.mall4j.cloud.api.order.bo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

/**
 * @author wuKeFan
 * @date 2021/2/5
 */
@Data
public class EsOrderItemBO {
    @Schema(description = "商品图片" , required = true)
    private String pic;

    @Schema(description = "商品名称" , required = true)
    private String spuName;

    @Schema(description = "商品数量" , required = true)
    private Integer count;

    @Schema(description = "商品价格" , required = true)
    private Long price;

    @Schema(description = "skuId" , required = true)
    private Long skuId;

    @Schema(description = "skuName" , required = true)
    private String skuName;

    @Schema(description = "订单项id" , required = true)
    private Long orderItemId;

    @Schema(description = "商品id" , required = true)
    private Long spuId;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 单个orderItem的配送类型  ：无需快递
     */
    private Integer deliveryType;

    /**
     * 加入购物车时间
     */
    private Date shopCartTime;

    /**
     * 商品总金额
     */
    private Long spuTotalAmount;

}
