package com.mall4j.cloud.common.security.bo;

import com.mall4j.cloud.api.auth.bo.UserInfoInTokenBO;

/**
 * 用于校验的用户信息
 *
 * @author wuKeFan
 * @date 2023-09-06 13:58:26
 */
public class AuthAccountInVerifyBO extends UserInfoInTokenBO {

	private String password;

	private Integer status;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AuthAccountInVerifyBO{" +
				"password='" + password + '\'' +
				", status=" + status +
				"} " + super.toString();
	}


}
