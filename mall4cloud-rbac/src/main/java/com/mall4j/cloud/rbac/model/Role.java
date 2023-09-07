package com.mall4j.cloud.rbac.model;

import com.mall4j.cloud.common.model.BaseModel;

import java.io.Serializable;
/**
 * 角色
 *
 * @author wuKeFan
 * @date 2023-09-06 17:09:35
 */
public class Role extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建者ID
     */
    private Long createUserId;

    /**
     * 业务类型 0平台菜单 1 店铺菜单
     */
    private Integer bizType;

	/**
	 * 所属租户id
	 */
	private Long tenantId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Integer getBizType() {
		return bizType;
	}

	public void setBizType(Integer bizType) {
		this.bizType = bizType;
	}

	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	@Override
	public String toString() {
		return "Role{" +
				"roleId=" + roleId +
				", roleName='" + roleName + '\'' +
				", remark='" + remark + '\'' +
				", createUserId=" + createUserId +
				", bizType=" + bizType +
				", tenantId=" + tenantId +
				"} " + super.toString();
	}
}