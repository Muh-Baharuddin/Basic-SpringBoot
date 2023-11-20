package com.practice.basic.qualifier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.basic.qualifier.repository.CustomerQualifierRepository;
import com.practice.basic.qualifier.service.CustomerTestQualifierService;
import com.practice.basic.testComponent.TestComponentConfig;

public class QualifierTest {
  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(TestComponentConfig.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testQualifierDI() {
    CustomerTestQualifierService customerQualifierService = applicationContext.getBean(CustomerTestQualifierService.class);
    CustomerQualifierRepository normalCustomerQualifierRepository = applicationContext.getBean("normalCustomerQualifierRepository", CustomerQualifierRepository.class);
    CustomerQualifierRepository premiumCustomerQualifierRepository = applicationContext.getBean("premiumCustomerQualifierRepository", CustomerQualifierRepository.class);

    Assertions.assertSame(normalCustomerQualifierRepository, customerQualifierService.getNormalCustomerQualifierRepository());
    Assertions.assertSame(premiumCustomerQualifierRepository, customerQualifierService.getPremiumCustomerQualifierRepository());
  }
}
