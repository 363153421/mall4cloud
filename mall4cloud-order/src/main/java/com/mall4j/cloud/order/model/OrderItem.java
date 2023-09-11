package com.mall4j.cloud.order.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
/**
 * 订单项
 *
 * @author wuKeFan
 * @date 2020-12-04 11:27:35
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class OrderItem extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 订单项ID
     */
    private Long orderItemId;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 产品ID
     */
    private Long spuId;

    /**
     * 产品SkuID
     */
    private Long skuId;

    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 购物车产品个数
     */
    private Integer count;

    /**
     * 产品名称
     */
    private String spuName;

    /**
     * sku名称
     */
    private String skuName;

    /**
     * 产品主图片路径
     */
    private String pic;

    /**
     * 单个orderItem的配送类型 3：无需快递
     */
    private Integer deliveryType;

    /**
     * 加入购物车时间
     */
    private Date shopCartTime;

    /**
     * 产品价格
     */
    private Long price;

    /**
     * 商品总金额
     */
    private Long spuTotalAmount;

}
