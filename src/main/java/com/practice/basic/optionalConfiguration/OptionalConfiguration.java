package com.practice.basic.optionalConfiguration;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.basic.data.Bar;
import com.practice.basic.data.Foo;
import com.practice.basic.data.FooBar;

@Configuration
public class OptionalConfiguration {

  @Bean
  public Foo foo() {
    return new Foo();
  }

  @Bean
  public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
    return new FooBar(foo.orElse(null), bar.orElse(null));
  }
}
