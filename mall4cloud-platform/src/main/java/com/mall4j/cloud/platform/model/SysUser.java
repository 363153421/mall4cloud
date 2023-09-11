package com.mall4j.cloud.platform.model;

import java.io.Serializable;

import com.mall4j.cloud.common.database.annotations.DistributedId;
import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 平台用户
 *
 * @author wuKeFan
 * @date 2020-12-21 14:16:34
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class SysUser extends BaseModel implements Serializable{

    /**
     * 平台用户id
     */
	@DistributedId("mall4cloud-platform-user")
    private Long sysUserId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String avatar;

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
