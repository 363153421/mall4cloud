package com.mall4j.cloud.api.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author wuKeFan
 * @date 2020/12/22
 */
@Data
@NoArgsConstructor
public class SkuStockLockDTO {

    @NotNull(message = "产品ID不能为空")
    @Schema(description = "产品ID" ,required=true)
    private Long spuId;

    @NotNull(message = "skuId不能为空")
    @Schema(description = "skuId" ,required=true)
    private Long skuId;

    @NotNull(message = "orderId不能为空")
    @Schema(description = "orderId" ,required=true)
    private Long orderId;

    @NotNull(message = "商品数量不能为空")
    @Min(value = 1,message = "商品数量不能为空")
    @Schema(description = "商品数量" ,required=true)
    private Integer count;

    public SkuStockLockDTO(Long spuId, Long skuId, Long orderId, Integer count) {
        this.spuId = spuId;
        this.skuId = skuId;
        this.orderId = orderId;
        this.count = count;
    }

}
