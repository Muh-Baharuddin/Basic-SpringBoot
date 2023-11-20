package com.practice.basic.objectProvider.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.practice.basic.objectProvider.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
  "com.practice.basic.configuration",
})
@Import(MultiFoo.class)
public class ObjectProviderConfiguration {
  
}
