package com.mall4j.cloud.auth.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 验证码登陆
 *
 * @author wuKeFan
 * @date 2023-09-06 17:09:35
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class CaptchaAuthenticationDTO extends AuthenticationDTO {

	@Schema(description = "验证码" , required = true)
	private String captchaVerification;

}
