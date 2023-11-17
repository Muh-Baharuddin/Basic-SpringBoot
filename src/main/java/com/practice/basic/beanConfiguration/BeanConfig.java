package com.practice.basic.beanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.basic.data.Foo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class BeanConfig {
  
  @Bean
  public Foo foo() {
    Foo foo = new Foo();
    log.info("Create new foo");
    return foo;
  }
}
