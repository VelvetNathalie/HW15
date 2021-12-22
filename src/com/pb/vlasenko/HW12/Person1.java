package com.pb.vlasenko.HW12;

import com.pb.vlasenko.HW11.WrongDateExceptions;
import com.pb.vlasenko.HW11.WrongMonthException;
import com.pb.vlasenko.HW11.WrongYearException;

import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person1 implements Serializable {
    private final static long serialVersionUID = 42;
    private String name;
    private String phone;
    private transient LocalDate dateOfBirth;
    private String adress;
    private transient java.time.LocalDateTime LocalDateTime;

    public Person1(String name, String phone, LocalDate dateOfBirth,
                  String adress,LocalDateTime LocalDateTime) {
        this.name = name;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
        this.LocalDateTime=LocalDateTime;
    }

    public Person1() {

    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public String getAdress() {
        return adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }




    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                //  ", changeDate=" + changeDate +
                ", adress='" + adress + '\'' +", LocalDateTime= "+LocalDateTime+
                '}' + " \n ";
    }

    public static void dateIn(int date, int month, int year) throws WrongDateExceptions, WrongMonthException, WrongYearException, DateTimeException {
        if (date < 0 || date > 31) {throw new WrongDateExceptions("введите целое число (день рождения)");}
        else if(month<0||month>12) {throw new WrongMonthException("введите целое число (номер месяца рождения)");}
        else if(year<0||year>2022) {throw new WrongYearException("введите целое число (год рождения)");}
        else {throw new DateTimeException("Invalid value");}
        //if (date>0||date<32month>0||month<13, year>0||year<2022) {System.out.println("продолжаем!");}
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

