package com.practice.basic.dependencyInjection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.practice.basic.data.Bar;
import com.practice.basic.data.Foo;
import com.practice.basic.data.FooBar;

public class withoutDITest {
  @Test
  void testNoDI() {
    var foo = new Foo();

    var bar = new Bar();

    var fooBar = new FooBar(foo, bar);

    Assertions.assertSame(foo, fooBar.getFoo());
    Assertions.assertSame(bar, fooBar.getBar());

  }
}
