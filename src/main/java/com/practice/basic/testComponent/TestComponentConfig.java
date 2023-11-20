package com.practice.basic.testComponent;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
  "com.practice.basic.qualifier"
})
public class TestComponentConfig {
  
}
