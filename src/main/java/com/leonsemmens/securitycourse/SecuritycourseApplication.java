package com.leonsemmens.securitycourse;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SecuritycourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritycourseApplication.class, args);
	}

}
