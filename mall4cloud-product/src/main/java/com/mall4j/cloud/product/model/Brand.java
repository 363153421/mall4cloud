package com.mall4j.cloud.product.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 品牌信息
 *
 * @author wuKeFan
 * @date 2020-10-28 15:27:24
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class Brand extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * brand_id
     */
    private Long brandId;

    /**
     * 品牌名称
     */
    private String name;

    /**
     * 品牌描述
     */
    private String desc;

    /**
     * 品牌logo图片
     */
    private String imgUrl;

    /**
     * 检索首字母
     */
    private String firstLetter;

    /**
     * 排序
     */
    private Integer seq;

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    private Integer status;

}
