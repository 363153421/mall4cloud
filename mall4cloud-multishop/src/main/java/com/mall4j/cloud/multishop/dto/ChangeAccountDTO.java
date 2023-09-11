package com.mall4j.cloud.multishop.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author wuKeFan
 * @date 2020/9/22
 */
@Data
public class ChangeAccountDTO {

    @NotNull(message = "userId not null")
    @Schema(description = "用户id" )
    private Long userId;

    @NotBlank(message = "username not blank")
    @Schema(description = "用户名" )
    private String username;

    @NotBlank(message = "password not blank")
    @Schema(description = "密码" )
    private String password;

    @NotNull(message = "status not null")
    @Schema(description = "状态 1启用 0禁用" )
    private Integer status;

    @Schema(description = "邮箱" )
    private String email;

    @Schema(description = "手机号" )
    private String phone;

}
