package com.rz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rz.dao")
public class DubboserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboserverApplication.class, args);
	}
}
