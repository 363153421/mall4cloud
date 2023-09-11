package com.mall4j.cloud.multishop.model;

import java.io.Serializable;
import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 轮播图
 *
 * @author wuKeFan
 * @date 2020-11-24 16:38:32
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class IndexImg extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long imgId;

    /**
     * 店铺ID
     */
    private Long shopId;

    /**
     * 图片
     */
    private String imgUrl;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 顺序
     */
    private Integer seq;

    /**
     * 关联商品id
     */
    private Long spuId;

    /**
     * 图片类型 0:小程序 1:pc
     */
    private Integer imgType;

}
