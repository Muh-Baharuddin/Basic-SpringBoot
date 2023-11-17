package com.practice.basic.scopeConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.practice.basic.data.Foo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ScopeConfig {
  @Bean
  @Scope("prototype")
  public Foo foo() {
    log.info("create new foo");
    return new Foo();
  }
}
