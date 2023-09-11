package com.mall4j.cloud.product.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 属性信息
 *
 * @author wuKeFan
 * @date 2020-10-28 15:27:23
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class Attr extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;


	/**
     * attr id
     */
    private Long attrId;

	/**
	 * 店铺id
	 */
	private Long shopId;

    /**
     * 属性名称
     */
    private String name;

    /**
     * 属性描述
     */
    private String desc;

	/**
	 * 作为搜索参数 0:不需要，1:需要
	 */
	private Integer searchType;

	/**
	 * 属性类型 0:销售属性，1:基本属性
	 */
	private Integer attrType;

	/**
	 * 属性值列表
	 */
	private List<AttrValue> attrValues;

}
