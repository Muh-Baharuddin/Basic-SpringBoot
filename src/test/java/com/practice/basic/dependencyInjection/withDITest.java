package com.practice.basic.dependencyInjection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.data.Bar;
import com.practice.basic.data.Foo;
import com.practice.basic.data.FooBar;

public class withDITest {
  private ApplicationContext applicationContext; 

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(DependencyInjection.class);
  }

  @Test
  void testDI() {
    Foo foo = applicationContext.getBean(Foo.class);
    Bar bar = applicationContext.getBean(Bar.class);
    FooBar fooBar = applicationContext.getBean(FooBar.class);

    Assertions.assertSame(foo, fooBar.getFoo());
    Assertions.assertSame(bar, fooBar.getBar());
  }
}
