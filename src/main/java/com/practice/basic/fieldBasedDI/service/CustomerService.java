package com.practice.basic.fieldBasedDI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.basic.fieldBasedDI.repository.CustomerRepository;

import lombok.Getter;

@Component
public class CustomerService {

  @Getter
  @Autowired
  private CustomerRepository customerRepository;
}
