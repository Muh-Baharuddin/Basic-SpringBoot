package com.practice.basic.singleton;

public class Singleton {
  private static Singleton singleton;

  public static Singleton getInstance() {
    if(singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
  
  private Singleton() {

  }
}
