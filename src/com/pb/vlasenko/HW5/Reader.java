package com.pb.vlasenko.HW5;

import com.pb.vlasenko.hw3.Array;

import javax.naming.Name;

public class Reader {
    private String fullname;
    private int numberofticket;
    private String faculty;
    private String dateofbirth;

    private static int bookCount = 0;

    public Reader(String fullname, int numberofticket, String faculty, String dateofbirth, String phone) {
        this.fullname = fullname;
        this.numberofticket = numberofticket;
        this.faculty = faculty;
        this.dateofbirth = dateofbirth;
        this.phone = phone;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public static void setBookCount(int bookCount) {
        Reader.bookCount = bookCount;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setNumberofticket(int numberofticket) {
        this.numberofticket = numberofticket;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String phone;

    public String getFullname() {
        return fullname;
    }

    public int getNumberofticket() {
        return numberofticket;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getPhone() {
        return phone;
    }


    String getinfo() {
        return "[ФИО: " + fullname + ", номер читательского билета " + numberofticket +
                ", факультет " + faculty + ", дата рождения " + dateofbirth + ", телефон " + phone + "]";
    }

    public void takeBook(int bookCount) {
        if (true)
            bookCount++;
        for (int i = 0; i< bookCount; i++) {

        System.out.println (fullname+" взял "+ bookCount +" книг");
        return;
    }}
    public void takeBook (String name,String... bookNames)
    {for (String getName:bookNames);
        { System.out.println(fullname+" взял книги: "+ name) ;}
    }

    public void takeBook(Book... books)
     {
      System.out.println(" взял книги: "+ books);}



    public void returnBook(int bookCount)
    {if (true)
        bookCount++;
        for (int i = 0; i< bookCount; i++)
        {System.out.println(fullname+"  вернул "+ bookCount +". ");
    }}

    public void returnBook (String name,String... bookNames)
    {for (String getName:bookNames);
        { System.out.println(fullname+" вернул книги: "+ name) ;}
    }

    public void returnBook(Book... books)
   // {for (Book[] book:books);}
    {System.out.println(fullname+" вернул книги: "+ getinfo());}

}
