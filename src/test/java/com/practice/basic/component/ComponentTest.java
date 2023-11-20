package com.practice.basic.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.componentConfiguration.ComponentConf;
import com.practice.basic.repository.CustomerRepository;
import com.practice.basic.service.CustomerService;

public class ComponentTest {
  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(ComponentConf.class);
    applicationContext.registerShutdownHook();
  }

  // @Test
  // void testService() {
  //   ComponentProductService productService1 = applicationContext.getBean(ComponentProductService.class);
  //   ComponentProductService productService2 = applicationContext.getBean("productService", ComponentProductService.class);

  //   Assertions.assertSame(productService1, productService2);
  // }

  @Test
  void testQualifier() {

    CustomerService customerService = applicationContext.getBean(CustomerService.class);

    CustomerRepository normalCustomerRepository = applicationContext.getBean("normalCustomerRepository",CustomerRepository.class);
    CustomerRepository premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository",CustomerRepository.class);

    Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
    Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());

  }
}
