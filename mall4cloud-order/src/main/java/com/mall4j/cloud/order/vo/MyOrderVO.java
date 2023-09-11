package com.mall4j.cloud.order.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 我的订单
 *
 * @author wuKeFan
 */
@Data
@Schema(description = "我的订单")
public class MyOrderVO {

	@Schema(description = "订单项" ,required=true)
	private List<MyOrderItemVO> orderItems;

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

}
