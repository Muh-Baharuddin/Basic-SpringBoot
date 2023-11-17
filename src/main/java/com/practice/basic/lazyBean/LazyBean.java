package com.practice.basic.lazyBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import com.practice.basic.data.Bar;
import com.practice.basic.data.Foo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class LazyBean {
  
  @Lazy
  @Bean
  @DependsOn({
    "bar"
  })
  public Foo foo() {
    log.info("create new foo");
    return new Foo();
  }

  @Bean
  public Bar bar() {
    log.info("create new bar");
    return new Bar();
  }
}
