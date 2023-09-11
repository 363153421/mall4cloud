package com.mall4j.cloud.multishop.model;

import java.io.Serializable;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 热搜
 *
 * @author wuKeFan
 * @date 2021-01-27 09:10:00
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class HotSearch extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long hotSearchId;

    /**
     * 店铺ID 0为全局热搜
     */
    private Long shopId;

    /**
     * 内容
     */
    private String content;

    /**
     * 顺序
     */
    private Integer seq;

    /**
     * 状态 0下线 1上线
     */
    private Integer status;

    /**
     * 热搜标题
     */
    private String title;

}
