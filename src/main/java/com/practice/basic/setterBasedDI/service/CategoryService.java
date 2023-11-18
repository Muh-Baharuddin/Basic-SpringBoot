package com.practice.basic.setterBasedDI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.basic.setterBasedDI.repository.CategoryRepository;

import lombok.Getter;

@Component
public class CategoryService {
  
  @Getter
  private CategoryRepository categoryRepository;

  @Autowired
  public void setCategoryRepository(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }
}
