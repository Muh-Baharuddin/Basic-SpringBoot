package com.practice.basic.eventListener;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.practice.basic.eventListener.listener.LoginAgainSuccessListener;
import com.practice.basic.eventListener.listener.LoginSuccessListener;
import com.practice.basic.eventListener.listener.UserListener;
import com.practice.basic.eventListener.service.UserServiceListener;

public class EventListenerTest {

  @Configuration
  @Import({
      UserServiceListener.class,
      LoginSuccessListener.class,
      LoginAgainSuccessListener.class,
      UserListener.class
  })
  public static class TestConfiguration {

  }

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testEvent() {

    UserServiceListener userService = applicationContext.getBean(UserServiceListener.class);
    userService.login("eko", "eko");
    userService.login("eko", "salah");
    userService.login("kurninawan", "salah");

  }
}
