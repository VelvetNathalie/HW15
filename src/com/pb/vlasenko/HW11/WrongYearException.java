package com.pb.vlasenko.HW11;

public class WrongYearException extends Exception{
    private int year;

    public WrongYearException(int year) {
        this.year = year;
    }

    public WrongYearException(Object o) {

    }
}
