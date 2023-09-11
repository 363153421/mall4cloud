package com.mall4j.cloud.common.order.vo;

import com.mall4j.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 用户地址VO
 *
 * @author wuKeFan
 * @date 2020-12-07 15:50:02
 */
@Data
public class UserAddrVO extends BaseVO{
    private static final long serialVersionUID = 1L;

    @Schema(description = "ID" )
    private Long addrId;

    @Schema(description = "手机" )
    private String mobile;

    @Schema(description = "是否默认地址 1是" )
    private Integer isDefault;

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

    @Schema(description = "区ID" )
    private Long areaId;

    @Schema(description = "区" )
    private String area;

    @Schema(description = "邮编" )
    private String postCode;

    @Schema(description = "地址" )
    private String addr;

    @Schema(description = "经度" )
    private Double lng;

    @Schema(description = "纬度" )
    private Double lat;

}
