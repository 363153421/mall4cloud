package com.mall4j.cloud.biz.mapper;

import com.mall4j.cloud.biz.model.AttachFileGroup;
import com.mall4j.cloud.biz.vo.AttachFileGroupVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wuKeFan
 * @date 2020-12-04 16:15:02
 */
public interface AttachFileGroupMapper {

	/**
	 * 获取列表
	 * @param shopId 店铺id
	 * @return 列表
	 */
	List<AttachFileGroupVO> list(@Param("shopId") Long shopId);

	/**
	 * 根据id获取
	 *
	 * @param attachFileGroupId id
	 * @return 详细信息
	 */
	AttachFileGroupVO getByAttachFileGroupId(@Param("attachFileGroupId") Long attachFileGroupId);

	/**
	 * 保存
	 *
	 * @param attachFileGroup 参数
	 */
	void save(@Param("attachFileGroup") AttachFileGroup attachFileGroup);

	/**
	 * 更新
	 *
	 * @param attachFileGroup 参数
	 */
	void update(@Param("attachFileGroup") AttachFileGroup attachFileGroup);

	/**
	 * 根据id删除
	 *
	 * @param attachFileGroupId 参数
	 */
	void deleteById(@Param("attachFileGroupId") Long attachFileGroupId);
}
