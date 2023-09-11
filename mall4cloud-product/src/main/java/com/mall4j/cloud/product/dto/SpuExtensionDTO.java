package com.mall4j.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

/**
 * DTO
 *
 * @author wuKeFan
 * @date 2020-11-11 13:49:06
 */
@Data
public class SpuExtensionDTO{
    private static final long serialVersionUID = 1L;

    @Schema(description = "商品扩展信息表id" )
    private Long spuExtendId;

    @Schema(description = "创建时间" )
    private Date createTime;

    @Schema(description = "更新时间" )
    private Date updateTime;

    @Schema(description = "商品id" )
    private Long spuId;

    @Schema(description = "销量" )
    private Integer saleNum;

    @Schema(description = "实际库存" )
    private Integer actualStock;

    @Schema(description = "锁定库存" )
    private Integer lockStock;

    @Schema(description = "可售卖库存" )
    private Integer stock;

}
