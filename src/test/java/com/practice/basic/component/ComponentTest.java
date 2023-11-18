package com.practice.basic.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.componentConfiguration.ComponentConfiguration;
import com.practice.basic.componentService.ComponentProductService;

public class ComponentTest {
  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testService() {
    ComponentProductService productService1 = applicationContext.getBean(ComponentProductService.class);
    ComponentProductService productService2 = applicationContext.getBean("productService", ComponentProductService.class);

    Assertions.assertSame(productService1, productService2);
  }
}
