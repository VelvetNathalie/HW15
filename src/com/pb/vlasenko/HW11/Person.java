package com.pb.vlasenko.HW11;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    private final static long serialVersionUID = 42;
    private String name;
    private String phone;
    private transient LocalDate dateOfBirth;
    private String adress;

    public Person(String name, String phone, LocalDate dateOfBirth,
                 String adress) {
        this.name = name;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
    }

    public Person() {

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

  //  public void setChangeDate(LocalDate changeDate) {
       // this.changeDate = changeDate;
  //  }

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
                ", adress='" + adress + '\'' +
                '}';
    }

}
