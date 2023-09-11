package com.mall4j.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 分类信息DTO
 *
 * @author wuKeFan
 * @date 2020-10-28 15:27:24
 */
@Data
public class CategoryDTO{
    private static final long serialVersionUID = 1L;

    @Schema(description = "分类id" )
    private Long categoryId;

    @Schema(description = "店铺id" )
    private Long shopId;

	@NotNull(message = "请选择上级分类")
    @Schema(description = "父ID" )
    private Long parentId;

	@NotNull(message = "分类名称不能为空")
    @Schema(description = "分类名称" )
    private String name;

    @Schema(description = "分类描述" )
    private String desc;

    @Schema(description = "分类地址{parent_id}-{child_id},..." )
    private String path;

	@NotNull(message = "状态不能为空")
    @Schema(description = "状态 1:enable, 0:disable, -1:deleted" )
    private Integer status;

    @Schema(description = "分类图标" )
    private String icon;

    @Schema(description = "分类的显示图片" )
    private String imgUrl;

    @Schema(description = "分类层级 从0开始" )
    private Integer level;

	@Schema(description = "排序" )
	private Integer seq;

}
