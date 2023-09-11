package com.mall4j.cloud.payment.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 订单支付记录DTO
 *
 * @author wuKeFan
 * @date 2020-12-25 09:50:59
 */
@Data
public class PayInfoDTO{

	@NotEmpty(message = "订单号不能为空")
	@Schema(description = "订单号" , required = true)
	private List<Long> orderIds;

	@Schema(description = "支付完成回跳地址" , required = true)
	private String returnUrl;

}
