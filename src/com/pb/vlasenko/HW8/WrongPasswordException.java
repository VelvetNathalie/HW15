package com.pb.vlasenko.HW8;

public class WrongPasswordException extends Exception {
private String password;

    public WrongPasswordException( String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
