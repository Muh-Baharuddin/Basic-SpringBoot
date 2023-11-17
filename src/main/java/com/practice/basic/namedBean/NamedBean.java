package com.practice.basic.namedBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.practice.basic.data.Foo;

@Configuration
public class NamedBean {
  
  @Primary
  @Bean(name = "fooFirst")
  public Foo foo1() {
    return new Foo();
  }

  @Bean(name = "fooSecond")
  public Foo foo2() {
    return new Foo();
  }
}
