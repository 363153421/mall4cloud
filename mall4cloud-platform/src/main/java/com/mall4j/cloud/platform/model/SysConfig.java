package com.mall4j.cloud.platform.model;

import java.io.Serializable;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 系统配置信息表
 *
 * @author wuKeFan
 * @date 2020-12-23 16:27:57
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class SysConfig extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private Long id;

    /**
     * key
     */
    private String paramKey;

    /**
     * value
     */
    private String paramValue;

    /**
     * 备注
     */
    private String remark;

}
