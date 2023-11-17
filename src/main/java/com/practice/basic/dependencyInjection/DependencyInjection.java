package com.practice.basic.dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.basic.data.Bar;
import com.practice.basic.data.Foo;
import com.practice.basic.data.FooBar;

@Configuration
public class DependencyInjection {
  
  @Bean
  public Foo foo() {
    return new Foo();
  }

  @Bean
  public Bar bar() {
    return new Bar();
  }

  @Bean
  public FooBar fooBar(Foo foo,Bar bar) {
    return new FooBar(foo, bar);
  }
}
