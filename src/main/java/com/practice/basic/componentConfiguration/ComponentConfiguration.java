package com.practice.basic.componentConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
  "com.practice.basic.componentService",
  "com.practice.basic.componentDI",
  "com.practice.basic.setterBasedDI",
  "com.practice.basic.fieldBasedDI"
})
public class ComponentConfiguration {
  
}
