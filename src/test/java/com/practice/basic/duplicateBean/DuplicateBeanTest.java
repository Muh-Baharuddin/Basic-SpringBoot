package com.practice.basic.duplicateBean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.data.Foo;

public class DuplicateBeanTest {
  @Test
  void testDuplicate() {
    ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBean.class);

    Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
      Foo foo = context.getBean(Foo.class);

      Assertions.assertNotNull(context);
      Assertions.assertNotNull(foo);
    });
  }

  @Test
  void getBean() {
    ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBean.class);

    Assertions.assertNotNull(context);

    Foo foo1 = context.getBean("foo1", Foo.class);
    Foo foo2 = context.getBean("foo2", Foo.class);

    Assertions.assertNotSame(foo1, foo2);
  }
}
