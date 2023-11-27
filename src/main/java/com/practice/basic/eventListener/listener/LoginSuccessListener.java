package com.practice.basic.eventListener.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.practice.basic.eventListener.event.LoginSuccessEvent;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LoginSuccessListener implements ApplicationListener<LoginSuccessEvent> {

  @Override
  public void onApplicationEvent(LoginSuccessEvent event) {
    log.info("Success login for user {}", event.getUser());
  }
}
