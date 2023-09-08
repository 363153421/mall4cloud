package com.mall4j.cloud.api.auth.constant;

/**
 * 系统类型
 * @author wuKeFan
 * @date 2023-09-08 16:13:30
 */
public enum SysTypeEnum {

	/**
	 * 普通用户系统
	 */
	ORDINARY(0),

	/**
	 * 商家端
	 */
	MULTISHOP(1),

	/**
	 * 平台端
	 */
	PLATFORM(2),

	;

	private final Integer value;

	public Integer value() {
		return value;
	}

	SysTypeEnum(Integer value) {
		this.value = value;
	}

}
