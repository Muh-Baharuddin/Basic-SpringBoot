package com.practice.basic.listableBeanFactory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.data.Foo;
import com.practice.basic.objectProvider.configuration.ObjectProviderConfiguration;

public class listableBeanFactoryTest {
  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(ObjectProviderConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testListable() {
    ObjectProvider<Foo> fooObjectProvider = applicationContext.getBeanProvider(Foo.class);
    List<Foo> fooList = fooObjectProvider.stream().collect(Collectors.toList());

    System.out.println(fooList);

    Map<String, Foo> beans = applicationContext.getBeansOfType(Foo.class);
    System.out.println(beans);
  }
}
