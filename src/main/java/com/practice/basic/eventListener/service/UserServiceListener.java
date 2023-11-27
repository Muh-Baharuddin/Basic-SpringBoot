package com.practice.basic.eventListener.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.practice.basic.eventListener.data.User;
import com.practice.basic.eventListener.event.LoginSuccessEvent;

public class UserServiceListener implements ApplicationEventPublisherAware {
  private ApplicationEventPublisher applicationEventPublisher;

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    this.applicationEventPublisher = applicationEventPublisher;
  }

  public boolean login(String username, String password){
    if(isLoginSuccess(username, password)){
      applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
      return true;
    }else{
      return false;
    }
  }

  private boolean isLoginSuccess(String username, String password) {
    return "eko".equals(username) && "eko".equals(password);
  }
}
