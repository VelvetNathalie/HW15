package com.pb.vlasenko.HW11;

public class WrongDateExceptions extends Exception{
    private int date;

    public WrongDateExceptions(int date) {
        this.date = date;
    }

    public WrongDateExceptions(Object o) {

    }
}
