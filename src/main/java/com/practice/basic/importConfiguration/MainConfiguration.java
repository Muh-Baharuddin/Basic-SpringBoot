package com.practice.basic.importConfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
  FooConfiguration.class,
  BarConfiguration.class
})
public class MainConfiguration {
  
}
