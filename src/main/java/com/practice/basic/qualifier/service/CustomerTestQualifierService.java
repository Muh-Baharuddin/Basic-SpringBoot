package com.practice.basic.qualifier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.practice.basic.qualifier.repository.CustomerQualifierRepository;

import lombok.Getter;

@Component
public class CustomerTestQualifierService {

  @Getter
  @Autowired
  @Qualifier("normalCustomerQualifierRepository")
  private CustomerQualifierRepository normalCustomerQualifierRepository;

  @Getter
  @Autowired
  @Qualifier("premiumCustomerQualifierRepository")
  private CustomerQualifierRepository premiumCustomerQualifierRepository;
}
