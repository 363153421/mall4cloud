package com.mall4j.cloud.order.vo;

import com.mall4j.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户订单配送地址VO
 *
 * @author wuKeFan
 * @date 2020-12-05 14:13:50
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class OrderAddrVO extends BaseVO{
    private static final long serialVersionUID = 1L;

    @Schema(description = "ID" )
    private Long orderAddrId;

    @Schema(description = "用户ID" )
    private Long userId;

    @Schema(description = "收货人" )
    private String consignee;

    @Schema(description = "省ID" )
    private Long provinceId;

    @Schema(description = "省" )
    private String province;

    @Schema(description = "城市ID" )
    private Long cityId;

    @Schema(description = "城市" )
    private String city;

    @Schema(description = "区域ID" )
    private Long areaId;

    @Schema(description = "区" )
    private String area;

    @Schema(description = "地址" )
    private String addr;

    @Schema(description = "邮编" )
    private String postCode;

    @Schema(description = "手机" )
    private String mobile;

}
