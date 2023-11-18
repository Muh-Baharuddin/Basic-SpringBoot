package com.practice.basic.componentDI.service;

import org.springframework.stereotype.Component;

import com.practice.basic.componentDI.repository.ProductRepository;

import lombok.Getter;

@Component
public class ProductService {
  
  @Getter
  private ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }
}
