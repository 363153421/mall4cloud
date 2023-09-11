package com.mall4j.cloud.api.vo.search;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * @author wuKeFan
 * @date 2020/11/16
 */
@Data
public class ProductSearchVO {


    @Schema(description = "店铺信息" )
    private ShopInfoSearchVO shopInfo;

    @Schema(description = "规格属性列表" )
    private List<AttrSearchVO> attrs;

    @Schema(description = "品牌列表信息" )
    private List<BrandSearchVO> brands;

    @Schema(description = "spu列表信息" )
    private List<SpuSearchVO> spus;

    @Schema(description = "分类列表信息" )
    private List<CategorySearchVO> categorys;

}
