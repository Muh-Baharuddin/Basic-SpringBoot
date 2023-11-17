package com.practice.basic.duplicateBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.basic.data.Foo;

@Configuration
public class DuplicateBean {
  
  @Bean
  public Foo foo1() {
    return new Foo();
  }

  @Bean
  public Foo foo2() {
    return new Foo();
  }
}
