package com.practice.basic.eventListener.event;

import org.springframework.context.ApplicationEvent;

import com.practice.basic.eventListener.data.User;

import lombok.Getter;

public class LoginSuccessEvent extends ApplicationEvent {
  @Getter
  private final User user;

  public LoginSuccessEvent(User user){
    super(user);
    this.user = user;
  }
}
