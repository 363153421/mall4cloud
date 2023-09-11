package com.mall4j.cloud.order.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mall4j.cloud.common.serializer.ImgJsonSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author wuKeFan
 */
@Data
@Schema(description = "我的订单-订单项")
public class MyOrderItemVO {

    @Schema(description = "商品图片" , required = true)
    @JsonSerialize(using = ImgJsonSerializer.class)
    private String pic;

    @Schema(description = "商品名称" , required = true)
    private String spuName;

    @Schema(description = "订单号" ,required=true)
    private Long orderId;

    @Schema(description = "商品数量" , required = true)
    private Integer count;

    @Schema(description = "商品价格" , required = true)
    private Long price;

    @Schema(description = "skuId" , required = true)
    private Long skuId;

    @Schema(description = "skuName" , required = true)
    private String skuName;

    @Schema(description = "订单项id" , required = true)
    private Long orderItemId;

    @Schema(description = "商品id" , required = true)
    private Long spuId;

}
