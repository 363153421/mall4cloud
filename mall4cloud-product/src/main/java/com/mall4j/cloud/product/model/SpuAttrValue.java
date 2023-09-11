package com.mall4j.cloud.product.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 商品规格属性关联信息
 *
 * @author wuKeFan
 * @date 2020-10-28 15:27:24
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class SpuAttrValue extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 商品属性值关联信息id
     */
    private Long spuAttrValueId;

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 规格属性id
     */
    private Long attrId;

    /**
     * 规格属性名称
     */
    private String attrName;

    /**
     * 规格属性值id
     */
    private Long attrValueId;

	/**
	 * 规格属性值名称
	 */
	private String attrValueName;

	/**
	 * 规格属性描述
	 */
	private String attrDesc;

}
