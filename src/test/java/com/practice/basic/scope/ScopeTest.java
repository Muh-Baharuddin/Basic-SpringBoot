package com.practice.basic.scope;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.data.Foo;
import com.practice.basic.scopeConfig.ScopeConfig;

public class ScopeTest {
  private ApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
  }

  @Test
  void testPrototypeScope() {
    Foo foo1 = applicationContext.getBean(Foo.class);
    Foo foo2 = applicationContext.getBean(Foo.class);
    Foo foo3 = applicationContext.getBean(Foo.class);

    Assertions.assertNotSame(foo1, foo2);
    Assertions.assertNotSame(foo1, foo3);
    Assertions.assertNotSame(foo2, foo3);

  }
}
