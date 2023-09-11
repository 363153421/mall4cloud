package com.mall4j.cloud.order.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 用户订单配送地址
 *
 * @author wuKeFan
 * @date 2020-12-05 14:13:50
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class OrderAddr extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long orderAddrId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 省ID
     */
    private Long provinceId;

    /**
     * 省
     */
    private String province;

    /**
     * 城市ID
     */
    private Long cityId;

    /**
     * 城市
     */
    private String city;

    /**
     * 区域ID
     */
    private Long areaId;

    /**
     * 区
     */
    private String area;

    /**
     * 地址
     */
    private String addr;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 手机
     */
    private String mobile;

}
