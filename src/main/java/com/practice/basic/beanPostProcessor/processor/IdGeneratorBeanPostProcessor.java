package com.practice.basic.beanPostProcessor.processor;

import java.util.UUID;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import com.practice.basic.beanPostProcessor.aware.IdAware;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {
  @Override
  public int getOrder() {
    return 1;
  }


  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    log.info("id generator processor for Bean {}", beanName);
    if(bean instanceof IdAware) {
      log.info("set id generator for Bean {}", beanName);
      IdAware idAware = (IdAware) bean;
      idAware.setId(UUID.randomUUID().toString());
    }

    return bean;
  }
}
