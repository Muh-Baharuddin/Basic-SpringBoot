package com.practice.basic.fieldBasedDI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.componentConfiguration.ComponentConfiguration;
import com.practice.basic.fieldBasedDI.repository.CustomerFieldRepository;
import com.practice.basic.fieldBasedDI.service.CustomerFieldService;

public class FieldBasedDependencyInjectionTest {
  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testFieldBaseDI() {
    CustomerFieldService customerService = applicationContext.getBean(CustomerFieldService.class);
    CustomerFieldRepository customerRepository = applicationContext.getBean(CustomerFieldRepository.class);

    Assertions.assertSame(customerRepository, customerService.getCustomerRepository());
  }
}
