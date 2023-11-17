package com.practice.basic.primaryBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.practice.basic.data.Foo;

@Configuration
public class PrimaryBean {
  
  @Primary
  @Bean
  public Foo foo1() {
    return new Foo();
  }

  @Bean
  public Foo foo2() {
    return new Foo();
  }
}
