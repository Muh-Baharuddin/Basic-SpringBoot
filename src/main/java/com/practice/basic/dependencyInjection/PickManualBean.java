package com.practice.basic.dependencyInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.practice.basic.data.Bar;
import com.practice.basic.data.Foo;
import com.practice.basic.data.FooBar;

@Configuration
public class PickManualBean {
  @Primary
  @Bean
  public Foo fooFirst() {
    return new Foo();
  }

  @Bean
  public Foo fooSecond() {
    return new Foo();
  }

  @Bean
  public Bar bar() {
    return new Bar();
  }

  @Bean
  public FooBar fooBar(
      @Qualifier("fooSecond") Foo foo,
      Bar bar
    ) {
    return new FooBar(foo, bar);
  }
}
