package com.practice.basic.factoryBean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.factoryBean.client.PaymentGatewayClient;
import com.practice.basic.factoryBean.configuration.FactoryConfiguration;

public class factoryBeanTest {
  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testFactoryBean() {
    PaymentGatewayClient gatewayClient = applicationContext.getBean(PaymentGatewayClient.class);

    Assertions.assertNotNull(gatewayClient);
    Assertions.assertEquals("https://example.com", gatewayClient.getEndpoint());
    Assertions.assertEquals("private", gatewayClient.getPrivateKey());
    Assertions.assertEquals("public", gatewayClient.getPublicKey());
  }
}
