package com.mall4j.cloud.rbac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wuKeFan
 * @date 2023-09-06 17:09:35
 */
@SpringBootApplication(scanBasePackages = { "com.mall4j.cloud" })
@EnableFeignClients(basePackages = {"com.mall4j.cloud.api.**.feign"})
public class RbacApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbacApplication.class, args);
	}

}
