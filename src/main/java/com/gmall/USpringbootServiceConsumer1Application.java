package com.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@SpringBootApplication
public class USpringbootServiceConsumer1Application {

	public static void main(String[] args) {
		SpringApplication.run(USpringbootServiceConsumer1Application.class, args);
	}

}
