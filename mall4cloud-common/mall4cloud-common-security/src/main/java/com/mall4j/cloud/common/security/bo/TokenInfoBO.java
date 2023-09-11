package com.mall4j.cloud.common.security.bo;

import com.mall4j.cloud.api.auth.bo.UserInfoInTokenBO;
import lombok.Data;

/**
 * token信息，该信息存在redis中
 *
 * @author wuKeFan
 * @date 2023-09-06 13:58:26
 */
@Data
public class TokenInfoBO {

	/**
	 * 保存在token信息里面的用户信息
	 */
	private UserInfoInTokenBO userInfoInToken;

	private String accessToken;

	private String refreshToken;

	/**
	 * 在多少秒后过期
	 */
	private Integer expiresIn;

}
