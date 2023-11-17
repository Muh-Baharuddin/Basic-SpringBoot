package com.practice.basic.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {
  
  @Test
  void testSingleton() {
    var singleton1 = Singleton.getInstance();
    var singleton2 = Singleton.getInstance();

    Assertions.assertSame(singleton1, singleton2);
  }
}
