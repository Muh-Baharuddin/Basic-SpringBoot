package com.practice.basic.dependsOn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {
  private ApplicationContext applicationContext; 

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(DependsOnConf.class);
  }

  @Test
  void dependsOnTest() {
    Assertions.assertNotNull(applicationContext);
  }
}
