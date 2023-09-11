package com.mall4j.cloud.multishop.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mall4j.cloud.api.product.vo.SpuVO;
import com.mall4j.cloud.common.serializer.ImgJsonSerializer;
import com.mall4j.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 轮播图VO
 *
 * @author wuKeFan
 * @date 2020-11-24 16:38:32
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class IndexImgVO extends BaseVO{
    private static final long serialVersionUID = 1L;

    @Schema(description = "主键" )
    private Long imgId;

    @Schema(description = "店铺ID" )
    private Long shopId;

    @Schema(description = "图片" )
	@JsonSerialize(using = ImgJsonSerializer.class)
    private String imgUrl;

    @Schema(description = "状态" )
    private Integer status;

    @Schema(description = "顺序" )
    private Integer seq;

    @Schema(description = "关联商品id" )
    private Long spuId;

    @Schema(description = "图片类型 0:小程序 1:pc" )
    private Integer imgType;

    @Schema(description = "spu信息" )
	private SpuVO spu;

}
