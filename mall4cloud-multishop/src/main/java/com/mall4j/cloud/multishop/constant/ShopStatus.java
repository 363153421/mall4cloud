package com.mall4j.cloud.multishop.constant;

/**
 * 店铺状态
 *
 * @author wuKeFan
 */
public enum ShopStatus {

    /**
     * 未开通
     */
    DELETE(-1),
    /**
     * 停业中
     */
    STOP(0),

    /**
     * 营业中
     */
    OPEN(1)

    ;

    private final Integer num;

    public Integer value() {
        return num;
    }

    ShopStatus(Integer num) {
        this.num = num;
    }

    public static ShopStatus instance(Integer value) {
        ShopStatus[] enums = values();
        for (ShopStatus statusEnum : enums) {
            if (statusEnum.value().equals(value)) {
                return statusEnum;
            }
        }
        return null;
    }
}
