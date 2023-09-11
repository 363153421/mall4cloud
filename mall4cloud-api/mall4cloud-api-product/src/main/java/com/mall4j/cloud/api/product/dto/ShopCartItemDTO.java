package com.mall4j.cloud.api.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 购物车物品参数
 *
 * @author wuKeFan
 * @date 2020-12-04 11:27:35
 */
@Data
public class ShopCartItemDTO {

	@NotNull(message = "产品ID不能为空")
	@Schema(description = "产品ID" ,required=true)
	private Long spuId;

	@NotNull(message = "skuId不能为空")
	@Schema(description = "skuId" ,required=true)
	private Long skuId;

	@NotNull(message = "商品数量不能为空")
	@Min(value = 1,message = "商品数量不能为空")
	@Schema(description = "商品数量" ,required=true)
	private Integer count;

	@NotNull(message = "店铺id不能为空")
	@Schema(description = "店铺id" ,required=true)
	private Long shopId;

}
