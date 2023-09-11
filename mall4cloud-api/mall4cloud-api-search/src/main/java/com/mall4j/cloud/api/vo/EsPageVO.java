package com.mall4j.cloud.api.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * @author wuKeFan
 * @date 2020/11/16
 */
@Data
public class EsPageVO<T> {

    @Schema(description = "总页数" )
    private Integer pages;

    @Schema(description = "总条目数" )
    private Long total;

    @Schema(description = "结果集" )
    private List<T> list;

}
