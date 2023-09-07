package com.mall4j.cloud.rbac.service.impl;

import com.mall4j.cloud.rbac.mapper.RoleMenuMapper;
import com.mall4j.cloud.rbac.service.RoleMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wuKeFan
 * @date 2023-09-06 17:09:35
 */
@Service
public class RoleMenuServiceImpl implements RoleMenuService {

	@Resource
	private RoleMenuMapper roleMenuMapper;

}
