package com.mall4j.cloud.product.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
/**
 * 属性与属性分组关联信息
 *
 * @author wuKeFan
 * @date 2020-11-23 16:20:01
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class AttrCategory extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 属性与分类关联id
     */
    private Long attrCategoryId;

    /**
     * 分类id
     */
    private Long categoryId;

    /**
     * 属性id
     */
    private Long attrId;

}
