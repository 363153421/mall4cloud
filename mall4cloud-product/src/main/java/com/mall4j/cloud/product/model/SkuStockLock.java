package com.mall4j.cloud.product.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
/**
 * 库存锁定信息
 *
 * @author wuKeFan
 * @date 2020-12-22 16:12:10
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class SkuStockLock extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * sku id
     */
    private Long skuId;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 锁定库存数量
     */
    private Integer count;

    /**
     * 状态-1已解锁 0待确定 1已锁定
     */
    private Integer status;

}
