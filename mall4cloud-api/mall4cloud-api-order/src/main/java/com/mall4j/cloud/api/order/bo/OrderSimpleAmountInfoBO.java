package com.mall4j.cloud.api.order.bo;

import lombok.Data;

/**
 * @author wuKeFan
 * @date 2020/12/30
 */
@Data
public class OrderSimpleAmountInfoBO {

    private Long orderId;

    private Long shopId;

    /**
     * 实际总值
     */
    private Long actualTotal;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 订单关闭原因
     */
    private Integer closeType;

}
