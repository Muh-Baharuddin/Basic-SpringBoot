package com.practice.basic.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FooBar {
  private Foo foo;

  private Bar bar;
}
