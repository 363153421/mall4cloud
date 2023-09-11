package com.mall4j.cloud.api.multishop.bo;

import com.mall4j.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 店铺详情VO
 *
 * @author wuKeFan
 * @date 2020-11-23 16:24:29
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class EsShopDetailBO extends BaseVO{

    private static final long serialVersionUID = 1L;

    @Schema(description = "店铺id" )
    private Long shopId;

    @Schema(description = "店铺类型1自营店 2普通店" )
    private Integer type;

    @Schema(description = "店铺名称" )
    private String shopName;

    @Schema(description = "店铺logo" )
    private String shopLogo;

    @Schema(description = "店铺状态(-1:未开通 0: 停业中 1:营业中)" )
    private Integer shopStatus;

}
