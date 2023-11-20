package com.practice.basic.fieldBasedDI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.basic.fieldBasedDI.repository.CustomerFieldRepository;

import lombok.Getter;

@Component
public class CustomerFieldService {

  @Getter
  @Autowired
  private CustomerFieldRepository customerRepository;
}
