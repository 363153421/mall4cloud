package com.mall4j.cloud.payment.bo;

import lombok.Data;

/**
 * 支付后返回的一些基础数据
 * @author wuKeFan
 * @date 2020/12/25
 */
@Data
public class PayInfoResultBO {

	/**
	 * 商城支付单号
	 */
	private Long payId;

	/**
	 * 第三方订单流水号
	 */
	private String bizPayNo;

	/**
	 * 是否支付成功
	 */
	private Integer isPaySuccess;

	/**
	 * 支付成功的标记
	 */
	private String successString;

	/**
	 * 支付金额
	 */
	private Long payAmount;

	/**
	 * 回调内容
	 */
	private String callbackContent;

}
