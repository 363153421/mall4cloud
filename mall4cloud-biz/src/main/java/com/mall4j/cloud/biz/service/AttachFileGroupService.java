package com.mall4j.cloud.biz.service;

import com.mall4j.cloud.biz.model.AttachFileGroup;
import com.mall4j.cloud.biz.vo.AttachFileGroupVO;

import java.util.List;

/**
 *
 *
 * @author wuKeFan
 * @date 2020-12-04 16:15:02
 */
public interface AttachFileGroupService {

	/**
	 * 获取列表
	 * @return 列表数据
	 */
	List<AttachFileGroupVO> list();

	/**
	 * 根据id获取
	 *
	 * @param attachFileGroupId id
	 * @return 详细信息
	 */
	AttachFileGroupVO getByAttachFileGroupId(Long attachFileGroupId);

	/**
	 * 保存
	 * @param attachFileGroup 参数
	 */
	void save(AttachFileGroup attachFileGroup);

	/**
	 * 更新
	 * @param attachFileGroup 参数
	 */
	void update(AttachFileGroup attachFileGroup);

	/**
	 * 根据id删除
	 * @param attachFileGroupId id
	 */
	void deleteById(Long attachFileGroupId);
}
