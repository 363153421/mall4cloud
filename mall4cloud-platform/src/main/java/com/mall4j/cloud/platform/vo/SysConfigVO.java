package com.mall4j.cloud.platform.vo;

import com.mall4j.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 系统配置信息表VO
 *
 * @author wuKeFan
 * @date 2020-12-23 16:27:57
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class SysConfigVO extends BaseVO{
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
