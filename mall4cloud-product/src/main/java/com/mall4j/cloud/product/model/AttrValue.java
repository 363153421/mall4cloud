package com.mall4j.cloud.product.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
/**
 * 属性值信息
 *
 * @author wuKeFan
 * @date 2020-10-28 15:27:24
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class AttrValue extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    private Long attrValueId;

    /**
     * 属性ID
     */
    private Long attrId;

    /**
     * 属性值
     */
    private String value;

}
