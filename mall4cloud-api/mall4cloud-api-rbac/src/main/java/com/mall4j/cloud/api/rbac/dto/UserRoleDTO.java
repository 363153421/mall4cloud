package com.mall4j.cloud.api.rbac.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author wuKeFan
 * @date 2020/11/27
 */
@Data
public class UserRoleDTO {

    /**
     * 用户id
     */
    @NotNull(message = "userId not null")
    private Long userId;


    /**
     * 角色id列表
     */
    @NotEmpty(message = "userId not null")
    private List<Long> roleIds;

}
