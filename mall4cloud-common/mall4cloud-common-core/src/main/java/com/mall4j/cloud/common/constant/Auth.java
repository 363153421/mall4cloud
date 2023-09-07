package com.mall4j.cloud.common.constant;

import com.mall4j.cloud.common.feign.FeignInsideAuthConfig;

/**
 * @author wuKeFan
 * @date 2023-09-06 14:05:39
 */
public interface Auth {

    String CHECK_TOKEN_URI = FeignInsideAuthConfig.FEIGN_INSIDE_URL_PREFIX + "/token/checkToken";

    String CHECK_RBAC_URI = FeignInsideAuthConfig.FEIGN_INSIDE_URL_PREFIX + "/insider/permission/checkPermission";
}
