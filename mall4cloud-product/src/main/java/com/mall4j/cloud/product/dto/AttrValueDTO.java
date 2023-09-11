package com.mall4j.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 属性值信息DTO
 *
 * @author wuKeFan
 * @date 2020-10-28 15:27:24
 */
@Data
public class AttrValueDTO{
    private static final long serialVersionUID = 1L;

    @Schema(description = "属性id" )
    private Long attrValueId;

    @Schema(description = "属性ID" )
    private Long attrId;

    @Schema(description = "属性值" )
    private String value;

}
