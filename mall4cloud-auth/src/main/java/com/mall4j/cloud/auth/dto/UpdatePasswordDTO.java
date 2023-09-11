package com.mall4j.cloud.auth.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 更新密码
 *
 * @author wuKeFan
 * @date 2023-09-06 17:09:35
 */
@Data
public class UpdatePasswordDTO {

	@NotBlank(message = "oldPassword NotBlank")
	@Schema(description = "旧密码" , required = true)
	private String oldPassword;

	@NotNull(message = "newPassword NotNull")
	@Schema(description = "新密码" , required = true)
	private String newPassword;

}
