package com.mall4j.cloud.platform.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mall4j.cloud.common.serializer.ImgJsonSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wuKeFan
 * @date 2020/9/2
 */
@Data
public class SysUserSimpleVO {

	/**
	 * 昵称
	 */
	@Schema(description = "昵称" )
	private String nickName;

	/**
	 * 头像
	 */
	@Schema(description = "头像" )
	@JsonSerialize(using = ImgJsonSerializer.class)
	private String avatar;

	private Integer isAdmin;

}
