package com.practice.basic.lazyBean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// import com.practice.basic.data.Foo;

public class LazyBeanTest {
  private ApplicationContext applicationContext; 

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(LazyBean.class);
  }

  @Test
  void dependsOnTest() {
    // Foo foo = applicationContext.getBean(Foo.class);

    Assertions.assertNotNull(applicationContext);
    // Assertions.assertNotNull(foo);
  }
}
