package com.mall4j.cloud.api.product.bo;

import lombok.Data;

/**
 * @author wuKeFan
 * @date 2020/11/12
 */
@Data
public class EsAttrBO {

    /**
     * 规格id
     */
    private Long attrId;

    /**
     * 规格名
     */
    private String attrName;

    /**
     * 规格值id
     */
    private Long attrValueId;

    /**
     * 规格值名称
     */
    private String attrValueName;

}
