package com.mall4j.cloud.api.leaf.feign;

import com.mall4j.cloud.common.feign.FeignInsideAuthConfig;
import com.mall4j.cloud.common.response.ServerResponseEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author wuKeFan
 * @date 2020/09/08
 */
@FeignClient(value = "mall4cloud-leaf",contextId ="segment")
public interface SegmentFeignClient {

	/**
	 * 获取id
	 * @param key 业务关键词
	 * @return 长整数Long
	 */
	@GetMapping(value = FeignInsideAuthConfig.FEIGN_INSIDE_URL_PREFIX + "/insider/segment")
	ServerResponseEntity<Long> getSegmentId(@RequestParam("key") String key);


}
