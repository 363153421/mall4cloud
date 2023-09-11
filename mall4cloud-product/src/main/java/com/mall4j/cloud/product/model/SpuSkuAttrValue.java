package com.mall4j.cloud.product.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 商品sku销售属性关联信息
 *
 * @author wuKeFan
 * @date 2020-10-28 15:27:24
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class SpuSkuAttrValue extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 商品sku销售属性关联信息id
     */
    private Long spuSkuAttrId;

    /**
     * SPU ID
     */
    private Long spuId;

    /**
     * SKU ID
     */
    private Long skuId;

    /**
     * 销售属性ID
     */
    private Long attrId;

    /**
     * 销售属性名称
     */
    private String attrName;

    /**
     * 销售属性值ID
     */
    private Long attrValueId;

    /**
     * 销售属性值
     */
    private String attrValueName;

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    private Integer status;

}
