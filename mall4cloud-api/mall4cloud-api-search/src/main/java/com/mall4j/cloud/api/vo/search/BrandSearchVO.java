package com.mall4j.cloud.api.vo.search;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author wuKeFan
 * @date 2020/11/17
 */
@Data
public class BrandSearchVO {

    @Schema(description = "品牌名称" )
    private String brandName;

    @Schema(description = "品牌id" )
    private Long brandId;

    @Schema(description = "品牌图片" )
    private String brandImg;

}
