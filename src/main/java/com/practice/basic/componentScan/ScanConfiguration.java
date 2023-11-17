package com.practice.basic.componentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "com.practice.basic.componentScanConfig"
})
public class ScanConfiguration {
  
}
