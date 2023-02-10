package com.gallery.app.transaction.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import com.gallery.app.transaction.domain.api.TransactionService;
import com.gallery.app.transaction.domain.api.TransactionServiceImp;
import com.gallery.app.transaction.domain.port.RepositoryPort;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class ApplicationConfiguration {

	@Bean
	public Docket apiConfiguration() {
		return new Docket(DocumentationType.OAS_30).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)
						.and(RequestHandlerSelectors.basePackage("org.springframework").negate()))
				.paths(PathSelectors.any()).build();
	}
	
	@Bean
	public TransactionService getTransactionService(RepositoryPort repositoryPort) {
		return new TransactionServiceImp(repositoryPort);
	}
}
