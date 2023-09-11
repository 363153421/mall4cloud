package com.mall4j.cloud.order.dto.multishop;

import com.mall4j.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 订单项VO
 *
 * @author wuKeFan
 * @date 2020-12-04 11:27:35
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class OrderItemDTO extends BaseVO{
    private static final long serialVersionUID = 1L;

    @Schema(description = "订单项ID" )
    private Long orderItemId;

	@Schema(description = "变化金额" , required = true)
	private Long changeAmount;

}
