package com.practice.basic.ordered;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.practice.basic.beanPostProcessor.data.Car;
import com.practice.basic.beanPostProcessor.processor.IdGeneratorBeanPostProcessor;
import com.practice.basic.beanPostProcessor.processor.PrefixIdGeneratorBeanPostProcessor;

public class OrderedTest {
  
  @Configuration
  @Import({
    Car.class,
    IdGeneratorBeanPostProcessor.class,
    PrefixIdGeneratorBeanPostProcessor.class
  })
  public static class TestOrderConfiguration {

  }

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(TestOrderConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testCar() {
    Car car = applicationContext.getBean(Car.class);

    System.out.println(car.getId());
    Assertions.assertNotNull(car.getId());
    Assertions.assertTrue(car.getId().startsWith("PREFIX-"));
  }
}
