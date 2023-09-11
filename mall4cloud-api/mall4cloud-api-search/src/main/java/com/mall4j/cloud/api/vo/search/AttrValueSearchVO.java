package com.mall4j.cloud.api.vo.search;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author wuKeFan
 * @date 2020/11/17
 */
@Data
public class AttrValueSearchVO {

    @Schema(description = "规格值id" )
    private Long attrValueId;

    @Schema(description = "规格值名称" )
    private String attrValueName;

}
