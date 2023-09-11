package com.mall4j.cloud.multishop.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author wuKeFan
 * @date 2020/12/30
 */
@Data
@Schema(description = "用户名和密码参数")
public class UsernameAndPasswordDTO {

    @NotBlank(message="用户名不能为空")
    @Size(max = 30)
    @Schema(description = "用户名" ,required=true)
    private String username;

    @NotBlank(message="密码不能为空")
    @Size(max = 64)
    @Schema(description = "密码" ,required=true)
    private String password;

    @Schema(description = "店铺id" )
    private Long shopId;

}
