package com.practice.basic.componentConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
  "com.practice.basic.repository",
  "com.practice.basic.service",
  "com.practice.basic.configuration",
})
public class ComponentConf {
  
}
