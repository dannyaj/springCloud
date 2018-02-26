package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SidecarApplication {
	public static void main(String[] args) {
		SpringApplication.run(SidecarApplication.class, args);
	}
}


// @EnableSidecar 整合了三個注解, @EnableCircuitBreaker, @EnableDiscoveryClient, @EnableZuulProxy