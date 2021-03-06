package com.thumati.springframework.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.thumati.springframework.domain"})
@EnableJpaRepositories(basePackages = {"com.thumati.springframework.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
