package com.mall4j.cloud.platform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author wuKeFan
 * @date 2020/9/8
 */
@Data
public class SysUserDTO {

    @Schema(description = "平台用户id" )
    private Long sysUserId;

    @NotBlank(message = "昵称不能为空")
    @Schema(description = "昵称" )
    private String nickName;

    @NotBlank(message = "头像不能为空")
    @Schema(description = "头像" )
    private String avatar;

    @Schema(description = "员工编号" )
    private String code;

    @Schema(description = "联系方式" )
    private String phoneNum;

    @Schema(description = "角色id列表" )
    private List<Long> roleIds;

}
