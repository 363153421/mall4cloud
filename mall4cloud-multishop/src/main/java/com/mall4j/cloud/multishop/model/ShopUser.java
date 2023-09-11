package com.mall4j.cloud.multishop.model;

import java.io.Serializable;

import com.mall4j.cloud.common.database.annotations.DistributedId;
import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商家用户
 *
 * @author wuKeFan
 * @date 2020-12-05 15:50:25
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class ShopUser extends BaseModel implements Serializable{

    /**
     * 商家用户id
     */
	@DistributedId("mall4cloud-multishop-user")
    private Long shopUserId;

    /**
     * 关联店铺id
     */
    private Long shopId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 员工编号
     */
    private String code;

    /**
     * 联系方式
     */
    private String phoneNum;

    /**
     * 是否已经设置账号
     */
    private Integer hasAccount;

}
