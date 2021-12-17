package com.pb.vlasenko.HW11;

public class WrongMonthException extends Exception{
    private int month;

    public WrongMonthException(int month) {
        this.month = month;
    }

    public WrongMonthException(Object o) {

    }
}
