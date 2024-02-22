package br.com.studyjava.projectspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "br.com.studyjava") //percorre os packages apartir do br.com.studyjava
public class ProjectSpringbootBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjectSpringbootBackendApplication.class, args);
	}
}