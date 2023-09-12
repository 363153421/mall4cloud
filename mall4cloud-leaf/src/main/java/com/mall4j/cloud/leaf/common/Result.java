package com.mall4j.cloud.leaf.common;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wuKeFan
 */
@Data
@NoArgsConstructor
public class Result {

	private long id;

	private Status status;

	public Result(long id, Status status) {
		this.id = id;
		this.status = status;
	}

}
