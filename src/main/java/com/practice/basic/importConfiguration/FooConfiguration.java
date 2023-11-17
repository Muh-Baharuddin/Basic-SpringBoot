package com.practice.basic.importConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.basic.data.Foo;

@Configuration
public class FooConfiguration {

  @Bean
  public Foo foo() {
    return new Foo();
  }
}
