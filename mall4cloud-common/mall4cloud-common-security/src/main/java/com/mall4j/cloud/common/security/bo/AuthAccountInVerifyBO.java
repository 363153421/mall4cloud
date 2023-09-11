package com.mall4j.cloud.common.security.bo;

import com.mall4j.cloud.api.auth.bo.UserInfoInTokenBO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用于校验的用户信息
 *
 * @author wuKeFan
 * @date 2023-09-06 13:58:26
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class AuthAccountInVerifyBO extends UserInfoInTokenBO {

	private String password;

	private Integer status;

}
