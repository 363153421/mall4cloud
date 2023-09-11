package com.mall4j.cloud.api.vo.search;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * @author wuKeFan
 * @date 2020/11/17
 */
@Data
public class AttrSearchVO {

    @Schema(description = "规格id" )
    private Long attrId;

    @Schema(description = "规格名" )
    private String attrName;

    @Schema(description = "规格值列表" )
    private List<AttrValueSearchVO> attrValues;

}
