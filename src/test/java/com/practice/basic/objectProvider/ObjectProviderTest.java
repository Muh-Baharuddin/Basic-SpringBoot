package com.practice.basic.objectProvider;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.objectProvider.configuration.ObjectProviderConfiguration;
import com.practice.basic.objectProvider.data.MultiFoo;

public class ObjectProviderTest {
  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(ObjectProviderConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testObjectProvider() {
    MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);
    Assertions.assertEquals(3, multiFoo.getFoos().size());
  }
}
