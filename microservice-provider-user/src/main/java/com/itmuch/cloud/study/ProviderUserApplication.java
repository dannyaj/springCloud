package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient // 是spring-cloud-commons 項目的注解, 而@EnableEurekaClient 是eureka 的client, 是spring-cloud-netflix的注解, 只能與eureka 一起工作
@SpringBootApplication
public class ProviderUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProviderUserApplication.class, args);
	}
}
