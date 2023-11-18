package com.practice.basic.fieldBasedDI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.componentConfiguration.ComponentConfiguration;
import com.practice.basic.fieldBasedDI.repository.CustomerRepository;
import com.practice.basic.fieldBasedDI.service.CustomerService;

public class FieldBasedDependencyInjectionTest {
  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testFieldBaseDI() {
    CustomerService customerService = applicationContext.getBean(CustomerService.class);
    CustomerRepository customerRepository = applicationContext.getBean(CustomerRepository.class);

    Assertions.assertSame(customerRepository, customerService.getCustomerRepository());
  }
}
