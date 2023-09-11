package com.mall4j.cloud.api.order.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 物流订单项信息DTO
 *
 * @author wuKeFan
 * @date 2020-12-07 15:10:00
 */
@Data
public class DeliveryOrderItemDTO{

    @Schema(description = "id" )
    private Long orderItemId;

    @Schema(description = "商品图片" )
    private String pic;

    @Schema(description = "商品名称" )
    private String spuName;

    @Schema(description = "发货改变的数量" )
    private Integer changeNum;

}
