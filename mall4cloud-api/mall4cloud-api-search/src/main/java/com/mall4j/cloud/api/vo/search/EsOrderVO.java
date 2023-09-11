package com.mall4j.cloud.api.vo.search;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author wuKeFan
 * @date 2021/2/5
 */
@Data
public class EsOrderVO {

    @Schema(description = "订单项" ,required=true)
    private List<EsOrderItemVO> orderItems;

    @Schema(description = "订单号" ,required=true)
    private Long orderId;

    @Schema(description = "总价" ,required=true)
    private Long actualTotal;

    @Schema(description = "订单状态" ,required=true)
    private Integer status;

    @Schema(description = "配送类型 3：无需快递" ,required=true)
    private Integer deliveryType;

    @Schema(description = "店铺名称" ,required=true)
    private String shopName;

    @Schema(description = "店铺id" ,required=true)
    private Long shopId;

    @Schema(description = "订单创建时间" ,required=true)
    private Date createTime;

    @Schema(description = "商品总数" ,required=true)
    private Integer allCount;

    @Schema(description = "收货人姓名" )
    private String consignee;

    @Schema(description = "收货人手机号" )
    private String mobile;

    /**
     * 用户订单地址Id
     */
    private Long orderAddrId;

    /**
     * 总值
     */
    private Long total;

    /**
     * 订单关闭原因 1-超时未支付4-买家取消 15-已通过货到付款交易
     */
    private Integer closeType;

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

}
