package br.com.drummond.acessojpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "br.com.drummond.acessojpa2.repository")
@EntityScan(basePackages={"br.com.drummond.acessojpa.modelo"})
@SpringBootApplication
@ComponentScan(basePackages={"br.com.drummond.acessojpa2.controller"})
public class AcessoJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcessoJpaApplication.class, args);
	}
}
