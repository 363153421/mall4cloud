package com.mall4j.cloud.leaf.common;

import lombok.Data;

/**
 * @author wuKeFan
 */
@Data
public class Result {

	private long id;

	private Status status;

	public Result(long id, Status status) {
		this.id = id;
		this.status = status;
	}

}
