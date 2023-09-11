package com.mall4j.cloud.api.order.bo;

import lombok.Data;

/**
 * @author wuKeFan
 * @date 2020/12/30
 */
@Data
public class OrderStatusBO {

    private Long orderId;

    private Integer status;

}
