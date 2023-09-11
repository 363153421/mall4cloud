package com.mall4j.cloud.auth.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 刷新token
 *
 * @author wuKeFan
 * @date 2023-09-06 17:09:35
 */
@Data
public class RefreshTokenDTO {

	/**
	 * refreshToken
	 */
	@NotBlank(message = "refreshToken不能为空")
	@Schema(description = "refreshToken" , required = true)
	private String refreshToken;

}
