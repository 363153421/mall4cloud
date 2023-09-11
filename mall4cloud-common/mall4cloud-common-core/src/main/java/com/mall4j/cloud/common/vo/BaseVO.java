package com.mall4j.cloud.common.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

/**
 * 阿里java开发手册： 【强制】表必备三字段：id, create_time, update_time。 说明：其中 id 必为主键，类型为 bigint
 * unsigned、单表时自增、步长为 1。create_time, update_time 的类型均为 datetime
 * 类型，前者现在时表示主动式创建，后者过去分词表示被动式更新。
 *
 * @author wuKeFan
 * @date 2023-09-06 17:09:35
 */
@Data
public class BaseVO {

	/**
	 * 创建时间
	 */
	@Schema(description = "创建时间" )
	protected Date createTime;

	/**
	 * 更新时间
	 */
	@Schema(description = "更新时间" )
	protected Date updateTime;

}
