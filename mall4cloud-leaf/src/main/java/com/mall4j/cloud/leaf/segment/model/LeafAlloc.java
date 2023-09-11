package com.mall4j.cloud.leaf.segment.model;

import lombok.Data;

/**
 * @author wuKeFan
 */
@Data
public class LeafAlloc {

	private String key;

	private long maxId;

	private int step;

	private String updateTime;

	private int randomStep;

}
