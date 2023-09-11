package com.mall4j.cloud.payment.model;

import java.io.Serializable;
import java.util.Date;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 订单支付记录
 *
 * @author wuKeFan
 * @date 2020-12-25 09:50:59
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class PayInfo extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

	public static final String DISTRIBUTED_ID_KEY = "mall4cloud-pay";

    /**
     * 支付单号
     */
    private Long payId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 外部订单流水号
     */
    private String bizPayNo;

	/**
	 * 本次支付关联的多个订单号
	 */
	private String orderIds;

    /**
     * 系统类型 见SysTypeEnum
     */
    private Integer sysType;

    /**
     * 支付状态
     */
    private Integer payStatus;

    /**
     * 支付金额
     */
    private Long payAmount;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 回调内容
     */
    private String callbackContent;

    /**
     * 回调时间
     */
    private Date callbackTime;

    /**
     * 确认时间
     */
    private Date confirmTime;

}
