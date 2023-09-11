package com.mall4j.cloud.order.bo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

/**
 * @author wuKeFan
 * @date 2021/2/4
 */
@Data
public class SubmitOrderPayAmountInfoBO {


    @Schema(description = "创建时间" )
    private Date createTime;

    @Schema(description = "总共需要支付金额" )
    private Long totalFee;

    @Schema(description = "订单地址id" )
    private Long orderAddrId;

}
