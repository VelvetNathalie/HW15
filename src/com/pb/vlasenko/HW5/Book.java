package com.pb.vlasenko.HW5;

public class Book {
    private String avtor;
    private String name;
    private String date;


    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

   public void setName(String name) {
        this.name = name;
   }

  public void setDate(String date) {
        this.date = date;
    }

    public String getAvtor() {
        return avtor;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
       return date;
    }

    String getinfo(){
        return "Hазвание " + "'' " +name + " '' " + "( автор: " + avtor+ ", год издания: " + date + ") ";
    }

    public Book(String avtor, String name, String date) {
        this.avtor = avtor;
        this.name = name;
        this.date = date;
    }
}
