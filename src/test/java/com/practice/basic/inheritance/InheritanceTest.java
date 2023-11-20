package com.practice.basic.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.inheritance.configuration.InheritanceConfiguration;
import com.practice.basic.inheritance.service.MerchantService;
import com.practice.basic.inheritance.service.MerchantServiceImpl;

public class InheritanceTest {
  
  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testInheritance() {
    MerchantService merchantService = applicationContext.getBean(MerchantService.class);
    MerchantServiceImpl merchantServiceImpl = applicationContext.getBean(MerchantServiceImpl.class);

    Assertions.assertSame(merchantService, merchantServiceImpl);
  }
}
