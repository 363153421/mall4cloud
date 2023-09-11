package com.mall4j.cloud.api.order.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 订单快递信息DTO
 *
 * @author wuKeFan
 * @date 2020-12-07 15:10:00
 */
@Data
public class DeliveryOrderDTO{

	@Schema(description = "deliveryOrderId" )
	private Long deliveryOrderId;

	@NotNull(message="订单号不能为空")
	@Schema(description = "订单号" ,required=true)
	private Long orderId;

	@NotNull(message="发货方式不能为空")
	@Schema(description = "发货方式" ,required=true)
	private Integer deliveryType;

	private List<DeliveryOrderItemDTO> selectOrderItems;

}
