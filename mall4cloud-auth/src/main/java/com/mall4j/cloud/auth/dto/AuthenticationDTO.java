package com.mall4j.cloud.auth.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 用于登陆传递账号密码
 *
 * @author wuKeFan
 * @date 2023-09-06 17:09:35
 */
@Data
public class AuthenticationDTO {

	/**
	 * 用户名
	 */
	@NotBlank(message = "principal不能为空")
	@Schema(description = "用户名" , required = true)
	protected String principal;

	/**
	 * 密码
	 */
	@NotBlank(message = "credentials不能为空")
	@Schema(description = "一般用作密码" , required = true)
	protected String credentials;

	/**
	 * sysType 参考SysTypeEnum
	 */
	@NotNull(message = "sysType不能为空")
	@Schema(description = "系统类型 0.普通用户系统 1.商家端" , required = true)
	protected Integer sysType;

}
