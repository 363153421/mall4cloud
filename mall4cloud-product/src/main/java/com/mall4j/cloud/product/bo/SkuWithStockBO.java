package com.mall4j.cloud.product.bo;

import lombok.Data;

/**
 * @author wuKeFan
 * @date 2020/12/30
 */
@Data
public class SkuWithStockBO {

    private Long id;

    private Long skuId;

    private Long spuId;

    private Integer count;

}
