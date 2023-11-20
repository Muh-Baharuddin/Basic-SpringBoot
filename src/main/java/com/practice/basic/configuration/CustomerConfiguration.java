package com.practice.basic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.practice.basic.repository.CustomerRepository;

@Configuration
public class CustomerConfiguration {
  
  @Primary
  @Bean
  public CustomerRepository normalCustomerRepository() {
    return new CustomerRepository();
  }

  @Bean
  public CustomerRepository premiumCustomerRepository() {
    return new CustomerRepository();
  }
}
