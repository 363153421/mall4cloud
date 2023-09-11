package com.mall4j.cloud.product.service;

import com.mall4j.cloud.api.product.vo.CategoryVO;

import java.util.List;

/**
 * 属性与属性分组关联信息
 *
 * @author wuKeFan
 * @date 2020-11-23 16:20:01
 */
public interface AttrCategoryService {

	/**
	 * 保存属性与属性分组关联信息
	 * @param attrId 属性id
	 * @param categoryId 分类id列表
	 */
	void save(Long attrId, List<Long> categoryId);

	/**
	 * 更新属性与属性分组关联信息
	 * @param attrId attrId
	 * @param categoryId categoryId
	 * @return
	 */
	List<Long> update(Long attrId, List<Long> categoryId);

	/**
	 * 根据属性Id，获取属性关联的分类列表信息
	 * @param attrId attrId
	 * @return 分类列表信息
	 */
    List<CategoryVO> listByAttrId(Long attrId);
}
