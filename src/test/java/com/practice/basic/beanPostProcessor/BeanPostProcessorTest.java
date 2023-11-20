package com.practice.basic.beanPostProcessor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.practice.basic.beanPostProcessor.data.Car;
import com.practice.basic.beanPostProcessor.processor.IdGeneratorBeanPostProcessor;

public class BeanPostProcessorTest {
  
  @Configuration
  @Import({
    Car.class,
    IdGeneratorBeanPostProcessor.class
  })
  public static class TestConfiguration {

  }
  
  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testCar() {
    Car car = applicationContext.getBean(Car.class);

    System.out.println(car.getId());
    Assertions.assertNotNull(car.getId());
  }
}
