package com.practice.basic.namedBean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.data.Foo;

public class NamedBeanTest {
  private ApplicationContext applicationContext; 

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(NamedBean.class);
  }

  @Test
  void getBeanNamed() {
    Foo foo = applicationContext.getBean(Foo.class);
    Foo foo1 = applicationContext.getBean("fooFirst", Foo.class);
    Foo foo2 = applicationContext.getBean("fooSecond", Foo.class);

    Assertions.assertEquals(foo, foo1);
    Assertions.assertNotSame(foo, foo2);
    Assertions.assertNotSame(foo1, foo2);
  }
}
