package com.pb.vlasenko.HW5;

public class Book {
    private String avtor;
    private String name;
    private String date;

    private static int bookCount = 0;
    private static int getBookCountCount = 0;

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
        return "[Автор: " + avtor + ", название " + name + ", год издания " + date + "]";
    }
}
