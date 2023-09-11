package com.mall4j.cloud.api.multishop.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mall4j.cloud.common.serializer.ImgJsonSerializer;
import com.mall4j.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 店铺详情VO
 *
 * @author wuKeFan
 * @date 2020-12-05 15:50:25
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class ShopDetailVO extends BaseVO{

    private static final long serialVersionUID = 1L;

    @Schema(description = "店铺id" )
    private Long shopId;

    @Schema(description = "店铺类型1自营店 2普通店" )
    private Integer type;

    @Schema(description = "店铺名称" )
    private String shopName;

    @Schema(description = "店铺简介" )
    private String intro;

    @Schema(description = "店铺logo(可修改)" )
	@JsonSerialize(using = ImgJsonSerializer.class)
    private String shopLogo;

    @Schema(description = "店铺状态(-1:已删除 0: 停业中 1:营业中)" )
    private Integer shopStatus;

    @Schema(description = "营业执照" )
	@JsonSerialize(using = ImgJsonSerializer.class)
    private String businessLicense;

    @Schema(description = "身份证正面" )
	@JsonSerialize(using = ImgJsonSerializer.class)
    private String identityCardFront;

    @Schema(description = "身份证反面" )
	@JsonSerialize(using = ImgJsonSerializer.class)
    private String identityCardLater;

	@Schema(description = "移动端背景图" )
	@JsonSerialize(using = ImgJsonSerializer.class)
	private String mobileBackgroundPic;

	@Schema(description = "用户名" ,required=true)
	private String username;

	@Schema(description = "密码" ,required=true)
	private String password;

}
