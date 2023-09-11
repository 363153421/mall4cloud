package com.mall4j.cloud.product.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 商品详情信息
 *
 * @author wuKeFan
 * @date 2020-10-28 15:27:24
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class SpuDetail extends BaseModel implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	private Long spuId;

	/**
	 * 商品详情
	 */
	private String detail;

}
