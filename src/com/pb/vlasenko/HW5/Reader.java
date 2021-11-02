package com.pb.vlasenko.HW5;

public class Reader {
    private String fullname;
    private int numberofticket;
    private String faculty;
    private String dateofbirth;



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


    String getinfo(){
        return "[ФИО: " + fullname + ", номер читательского билета " + numberofticket +
                ", факультет " + faculty + ", дата рождения " + dateofbirth + ", телефон " + phone+"]";
    }

    public void takeBook(String fullname)
    {
        System.out.println( fullname + " взял 3 книги.");

    }
    public void takeBook(String fullname, String name)
    {
        System.out.println( fullname +
                " взял книги:"+name+", "
                + name+", " + name+".");
    }

    public void takeBook(String fullname, String name, String avtor,String date)
    {
        System.out.println( fullname + " взял книги: " +
               name +avtor+date + name + avtor + date+ name + avtor+date);

    }
   // public void returnBook()
}
