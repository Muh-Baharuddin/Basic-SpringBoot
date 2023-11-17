package com.practice.basic.primaryBean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.data.Foo;

public class PrimaryBeanTest {
  private ApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(PrimaryBean.class);
  }

  @Test
  void getBean() {
    Foo foo = applicationContext.getBean(Foo.class);
    Foo foo1 = applicationContext.getBean("foo1", Foo.class);
    Foo foo2 = applicationContext.getBean("foo2", Foo.class);

    Assertions.assertSame(foo, foo1);
    Assertions.assertNotSame(foo, foo2);
    Assertions.assertNotSame(foo1, foo2);
  }
}
