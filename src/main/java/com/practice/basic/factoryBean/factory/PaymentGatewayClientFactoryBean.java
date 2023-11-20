package com.practice.basic.factoryBean.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.practice.basic.factoryBean.client.PaymentGatewayClient;

@Component("paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient>{
  
  @Override
  public PaymentGatewayClient getObject() throws Exception {
    PaymentGatewayClient client = new PaymentGatewayClient();
    client.setEndpoint("https://example.com");
    client.setPrivateKey("private");
    client.setPublicKey("public");
    return client;
  }

  @Override
  public Class<?> getObjectType() {
    return PaymentGatewayClient.class;
  }
}
