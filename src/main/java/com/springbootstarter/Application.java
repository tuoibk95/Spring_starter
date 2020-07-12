/**
 * Copyright(C) 2020 Luvina Software Company
 * app.java Jun 18, 2020 TuoiLV
 */
package com.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

/**
 * 
 * @author TuoiLv
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class Application {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
