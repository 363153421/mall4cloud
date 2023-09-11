package com.mall4j.cloud.product.model;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
/**
 * 购物车
 *
 * @author wuKeFan
 * @date 2020-11-21 10:01:23
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class ShopCartItem extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long cartItemId;

    /**
     * 店铺ID
     */
    private Long shopId;

    /**
     * 产品ID
     */
    private Long spuId;

    /**
     * SkuID
     */
    private Long skuId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 购物车产品个数
     */
    private Integer count;

    /**
     * 售价，加入购物车时的商品价格
     */
    private Long priceFee;

	/**
	 * 是否已经勾选
	 */
	private Integer isChecked;

}
