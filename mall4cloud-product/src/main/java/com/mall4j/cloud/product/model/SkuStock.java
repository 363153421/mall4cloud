package com.mall4j.cloud.product.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 库存信息
 *
 * @author wuKeFan
 * @date 2020-11-11 13:49:06
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class SkuStock extends BaseModel implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 库存id
	 */
	private Long stockId;

	/**
	 * SKU ID
	 */
	private Long skuId;

	/**
	 * 实际库存
	 */
	private Integer actualStock;

	/**
	 * 锁定库存
	 */
	private Integer lockStock;

	/**
	 * 可售卖库存
	 */
	private Integer stock;

}
