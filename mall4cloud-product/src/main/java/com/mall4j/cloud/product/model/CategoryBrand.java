package com.mall4j.cloud.product.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
/**
 * 品牌分类关联信息
 *
 * @author wuKeFan
 * @date 2020-10-28 15:27:24
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class CategoryBrand extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long id;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 分类id
     */
    private Long categoryId;

}
