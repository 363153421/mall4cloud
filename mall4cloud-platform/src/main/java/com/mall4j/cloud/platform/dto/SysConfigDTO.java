package com.mall4j.cloud.platform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

/**
 * 系统配置信息表DTO
 *
 * @author wuKeFan
 * @date 2020-12-23 16:27:57
 */
@Data
public class SysConfigDTO{
    private static final long serialVersionUID = 1L;

    @Schema()
    private Long id;

    @Schema(description = "key" )
    private String paramKey;

    @Schema(description = "value" )
    private String paramValue;

    @Schema(description = "备注" )
    private String remark;

}
