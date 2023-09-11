package com.mall4j.cloud.api.rbac.bo;

import lombok.Data;

/**
 * uri权限bo
 *
 * @author wuKeFan
 * @date 2020/9/3
 */
@Data
public class UriPermissionBO {

	/**
	 * 请求方法 1.GET 2.POST 3.PUT 4.DELETE
	 */
	private Integer method;

	/**
	 * uri
	 */
	private String uri;

	/**
	 * permission
	 */
	private String permission;

}
