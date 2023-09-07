package com.mall4j.cloud.auth.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 更新密码
 *
 * @author wuKeFan
 * @date 2023-09-06 17:09:35
 */
public class UpdatePasswordDTO {

	@NotBlank(message = "oldPassword NotBlank")
	@Schema(description = "旧密码" , required = true)
	private String oldPassword;

	@NotNull(message = "newPassword NotNull")
	@Schema(description = "新密码" , required = true)
	private String newPassword;

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	@Override
	public String toString() {
		return "UpdatePasswordDTO{" +
				"oldPassword='" + oldPassword + '\'' +
				", newPassword='" + newPassword + '\'' +
				'}';
	}
}