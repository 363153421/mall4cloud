package com.mall4j.cloud.common.order.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 订单支付成功通知
 * @author wuKeFan
 * @date 2020/12/8
 */
@Data
@NoArgsConstructor
public class PayNotifyBO {

    private List<Long> orderIds;

    public PayNotifyBO(List<Long> orderIds) {
        this.orderIds = orderIds;
    }

}
