package com.practice.basic.componentScanConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.basic.data.Bar;

@Configuration
public class BarConfiguration {
  @Bean
  public Bar bar() {
    return new Bar();
  }
}
