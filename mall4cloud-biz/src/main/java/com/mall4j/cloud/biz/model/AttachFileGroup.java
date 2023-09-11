package com.mall4j.cloud.biz.model;

import java.io.Serializable;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 *
 * @author wuKeFan
 * @date 2020-12-04 16:15:02
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class AttachFileGroup extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long attachFileGroupId;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 分组名称
     */
    private String name;

}
