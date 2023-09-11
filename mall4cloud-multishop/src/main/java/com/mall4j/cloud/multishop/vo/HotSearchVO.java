package com.mall4j.cloud.multishop.vo;

import com.mall4j.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 热搜VO
 *
 * @author wuKeFan
 * @date 2021-01-27 09:10:00
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class HotSearchVO extends BaseVO{
    private static final long serialVersionUID = 1L;

    @Schema(description = "主键" )
    private Long hotSearchId;

    @Schema(description = "店铺ID 0为全局热搜" )
    private Long shopId;

    @Schema(description = "内容" )
    private String content;

    @Schema(description = "顺序" )
    private Integer seq;

    @Schema(description = "状态 0下线 1上线" )
    private Integer status;

    @Schema(description = "热搜标题" )
    private String title;

}
