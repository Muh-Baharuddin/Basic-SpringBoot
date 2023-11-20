package com.practice.basic.objectProvider.data;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import com.practice.basic.data.Foo;

import lombok.Getter;

@Component
public class MultiFoo {
    
  @Getter
  private List<Foo> foos;

  public MultiFoo(ObjectProvider<Foo> objectProvider) {
    // objectProvider.getIfAvailable(); // get one
    foos = objectProvider.stream().collect(Collectors.toList());
  }
}
