package com.mall4j.cloud.order.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * 订单信息
 *
 * @author wuKeFan
 * @date 2020-12-05 14:13:50
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class Order extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

	public static final String DISTRIBUTED_ID_KEY = "mall4cloud-order";

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 用户ID
     */
    private Long userId;

	/**
	 * 店铺名称
	 */
	private String shopName;

    /**
     * 总值
     */
    private Long total;

    /**
     * 订单状态 1:待付款 2:待发货 3:待收货(已发货) 5:成功 6:失败
     */
    private Integer status;

    /**
     * 配送类型 3：无需快递
     */
    private Integer deliveryType;

	/**
	 * 用户订单地址Id
	 */
	private Long orderAddrId;

	/**
	 * 订单地址
	 */
	private OrderAddr orderAddr;

    /**
     * 订单关闭原因 1-超时未支付 4-买家取消 15-已通过货到付款交易
     */
    private Integer closeType;

    /**
     * 订单商品总数
     */
    private Integer allCount;

    /**
     * 付款时间
     */
    private Date payTime;

    /**
     * 发货时间
     */
    private Date deliveryTime;

    /**
     * 完成时间
     */
    private Date finallyTime;

    /**
     * 取消时间
     */
    private Date cancelTime;

    /**
     * 是否已支付，1.已支付0.未支付
     */
    private Integer isPayed;

    /**
     * 用户订单删除状态，0：没有删除， 1：回收站， 2：永久删除
     */
    private Integer deleteStatus;

	/**
	 * 订单项
	 */
	private List<OrderItem> orderItems;

}
