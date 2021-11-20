package com.pb.vlasenko.HW8;

public class WrongLoginException extends Exception {

  private String login;
  public WrongLoginException(String login){this.login=login;}

    public String getLogin() {
        return login;
    }

  //public WrongLoginException(String message, String login) {
  //  super(message);
   // this.login = login;
 // }
}
