package com.practice.basic.componentScan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.data.Bar;
import com.practice.basic.data.Foo;

public class ScanTest {
  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testScan() {
    Foo foo = applicationContext.getBean(Foo.class);
    Bar bar = applicationContext.getBean(Bar.class);

    Assertions.assertNotNull(foo);
    Assertions.assertNotNull(bar);
  }
}
