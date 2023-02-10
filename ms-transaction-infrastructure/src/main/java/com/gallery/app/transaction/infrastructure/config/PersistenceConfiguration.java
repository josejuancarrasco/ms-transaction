package com.gallery.app.transaction.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gallery.app.transaction.domain.port.RepositoryPort;
import com.gallery.app.transaction.infrastructure.adapter.TransactionRepositoryAdapter;

@Configuration
public class PersistenceConfiguration {
	
	@Bean
	public RepositoryPort getRepositoryPort() {
		return new TransactionRepositoryAdapter();
	}

}
