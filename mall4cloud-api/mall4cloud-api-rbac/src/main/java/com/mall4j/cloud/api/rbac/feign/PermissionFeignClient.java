package com.mall4j.cloud.api.rbac.feign;

import com.mall4j.cloud.api.rbac.dto.ClearUserPermissionsCacheDTO;
import com.mall4j.cloud.common.constant.Auth;
import com.mall4j.cloud.common.feign.FeignInsideAuthConfig;
import com.mall4j.cloud.common.response.ServerResponseEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author wuKeFan
 * @date 2020/09/02
 */
@FeignClient(value = PermissionFeignClient.SERVICE_NAME,contextId = "permission")
public interface PermissionFeignClient {

	String SERVICE_NAME = "mall4cloud-rbac";

	/**
	 * 校验是否有某个uri的权限
	 * @param userId 用户id
	 * @param sysType 系统类型
	 * @param uri 链接地址
	 * @param isAdmin 是否是管理员
	 * @param method 请求方式
	 * @return 是否有某个uri的权限
	 */
	@GetMapping(value = Auth.CHECK_RBAC_URI)
	ServerResponseEntity<Boolean> checkPermission(@RequestParam("userId") Long userId,@RequestParam("sysType") Integer sysType,
												  @RequestParam("uri") String uri,@RequestParam("isAdmin") Integer isAdmin,
												  @RequestParam("method") Integer method);

	/**
	 * 清除用户权限缓存
	 * @param clearUserPermissionsCacheDTO 参数信息
	 * @return 是否调用成功
	 */
	@PostMapping(value = FeignInsideAuthConfig.FEIGN_INSIDE_URL_PREFIX + "/insider/permission/clearUserPermissionsCache")
	ServerResponseEntity<Void> clearUserPermissionsCache(@RequestBody ClearUserPermissionsCacheDTO clearUserPermissionsCacheDTO);

}
