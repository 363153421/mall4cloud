package com.mall4j.cloud.rbac.service.impl;

import com.mall4j.cloud.rbac.mapper.UserRoleMapper;
import com.mall4j.cloud.rbac.service.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wuKeFan
 * @date 2023-09-06 17:09:35
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Resource
	private UserRoleMapper userRoleMapper;

}
