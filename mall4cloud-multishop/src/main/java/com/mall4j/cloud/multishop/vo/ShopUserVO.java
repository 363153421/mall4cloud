package com.mall4j.cloud.multishop.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * @author wuKeFan
 * @date 2020/9/2
 */
@Data
public class ShopUserVO {

	/**
	 * shopUserId
	 */
	@Schema(description = "店铺用户id" )
	private Long shopUserId;

	/**
	 * 昵称
	 */
	@Schema(description = "昵称" )
	private String nickName;

	/**
	 * 员工编号
	 */
	@Schema(description = "员工编号" )
	private String code;

	/**
	 * 联系方式
	 */
	@Schema(description = "联系方式" )
	private String phoneNum;

	@Schema(description = "是否已经有账号了" )
	private Integer hasAccount;

	@Schema(description = "店铺id" )
	private Long shopId;

	@Schema(description = "角色id列表" )
	private List<Long> roleIds;

}
