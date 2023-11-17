package com.practice.basic.bean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.beanConfiguration.BeanConfig;
import com.practice.basic.data.Foo;

public class BeanTest {
  @Test
  void testCreateBean() {
    ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
    
    Assertions.assertNotNull(context); 
  }

  @Test
  void testGetBean() {
    ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

    Assertions.assertNotNull(context); 

    Foo foo1 = context.getBean(Foo.class);
    Foo foo2 = context.getBean(Foo.class);

    Assertions.assertSame(foo1, foo2);
  }
}
