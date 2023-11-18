package com.practice.basic.componentDI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.basic.componentDI.repository.ProductRepository;

import lombok.Getter;

@Component
public class ProductService {
  
  @Getter
  private ProductRepository productRepository;

  @Autowired
  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public ProductService(ProductRepository productRepository, String name) {
    this.productRepository = productRepository;
  }
}
