package com.mall4j.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author wuKeFan
 * @date 2023-09-06 11:52:09
 */
@SpringBootApplication(scanBasePackages = { "com.mall4j.cloud" })
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}