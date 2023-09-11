package com.mall4j.cloud.common.cache.bo;

import lombok.Data;

/**
 * 通过 cacheName 配置 和 时间告诉缓存多久清楚一遍
 *
 * @author wuKeFan
 * @date 2020/7/4
 */
@Data
public class CacheNameWithTtlBO {

	private String cacheName;

	private Integer ttl;

	public CacheNameWithTtlBO(String cacheName, Integer ttl) {
		this.cacheName = cacheName;
		this.ttl = ttl;
	}

}
