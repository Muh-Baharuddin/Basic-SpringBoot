package com.practice.basic.beanPostProcessor.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import com.practice.basic.beanPostProcessor.aware.IdAware;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

  
  @Override
  public int getOrder() {
    return 2;
  }


  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    log.info("prefix id generator processor for Bean {}", beanName);
    if(bean instanceof IdAware) {
      log.info("prefix set id generator for Bean {}", beanName);
      IdAware idAware = (IdAware) bean;
      idAware.setId("PREFIX-" + idAware.getId());
    }

    return bean;
  }
}
