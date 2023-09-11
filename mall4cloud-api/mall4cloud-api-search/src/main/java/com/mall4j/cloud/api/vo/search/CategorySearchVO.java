package com.mall4j.cloud.api.vo.search;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 分类信息VO
 *
 * @author wuKeFan
 * @date 2020-1-05 15:37:24
 */
@Data
public class CategorySearchVO{
    private static final long serialVersionUID = 1L;

    @Schema(description = "分类id" )
    private Long categoryId;

    @Schema(description = "分类名称" )
    private String name;

}
