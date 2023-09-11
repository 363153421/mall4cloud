package com.mall4j.cloud.product.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 * @author wuKeFan
 * @date 2020-11-11 13:49:06
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class SpuExtension extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 商品扩展信息表id
     */
    private Long spuExtendId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 销量
     */
    private Integer saleNum;

    /**
     * 实际库存
     */
    private Integer actualStock;

    /**
     * 锁定库存
     */
    private Integer lockStock;

    /**
     * 可售卖库存
     */
    private Integer stock;

}
