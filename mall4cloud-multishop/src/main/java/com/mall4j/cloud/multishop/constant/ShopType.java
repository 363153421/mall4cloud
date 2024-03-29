package com.mall4j.cloud.multishop.constant;

/**
 * 店铺状态
 *
 * @author wuKeFan
 */
public enum ShopType {

    /**
     * 自营店
     */
    SELF_SHOP(-1),
    /**
     * 其他店铺
     */
    STOP(0)
    ;

    private final Integer num;

    public Integer value() {
        return num;
    }

    ShopType(Integer num) {
        this.num = num;
    }

    public static ShopType instance(Integer value) {
        ShopType[] enums = values();
        for (ShopType statusEnum : enums) {
            if (statusEnum.value().equals(value)) {
                return statusEnum;
            }
        }
        return null;
    }
}
