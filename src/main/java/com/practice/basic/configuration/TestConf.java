package com.practice.basic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.practice.basic.qualifier.repository.CustomerQualifierRepository;

@Configuration
public class TestConf {
  @Primary
  @Bean
  public CustomerQualifierRepository normalCustomerRepository() {
    return new CustomerQualifierRepository();
  }

  @Bean
  public CustomerQualifierRepository premiumCustomerRepository() {
    return new CustomerQualifierRepository();
  }
}
