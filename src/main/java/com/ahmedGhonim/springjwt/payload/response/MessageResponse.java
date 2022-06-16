package com.ahmedGhonim.springjwt.payload.response;
/**
 * @author Ghonim
 */
public class MessageResponse {
  private String message;

  public MessageResponse(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
