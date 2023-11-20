package com.practice.basic.factoryBean.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.practice.basic.factoryBean.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import({
  PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
  
}
