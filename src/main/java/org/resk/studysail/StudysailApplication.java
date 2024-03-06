package org.resk.studysail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class StudysailApplication {
	public static void main(String[] args) {
		System.out.println("Started");
		SpringApplication.run(StudysailApplication.class, args);
	}
}
