package com.practice.basic.componentScanConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.basic.data.Foo;

@Configuration
public class FooScanConfiguration {

  @Bean
  public Foo foo() {
    return new Foo();
  }
}
