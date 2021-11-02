package com.pb.vlasenko.HW5;

public class Library {
    public static void main(String[] args) {
        Book book1=new Book();
        Book book2=new Book();
        Book book3=new Book();

        book1.setAvtor("Иванов И. И.");
        book2.setAvtor("Сидоров А. В");
        book3.setAvtor("Гусев К. В");
        book1.setDate("2000 г.");
        book2.setDate("1980 г.");
        book3.setDate("2010 г.");
        book1.setName("Приключения");
        book2.setName("Словарь");
        book3.setName("Энциклопедия");
        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();
        reader1.setFullname("Петров В. В.");
        reader1.setDateofbirth("28.07.2009");
        reader1.setFaculty("Филология");
        reader1.setNumberofticket(1);
        reader1.setPhone("+380675153058");
        reader2.setFullname("Леси Филеберт");
        reader2.setDateofbirth("11.10.2001");
        reader2.setFaculty("Филология");
        reader2.setNumberofticket(2);
        reader2.setPhone("+380673256558");
        reader3.setFullname("Диана Маш");
        reader3.setDateofbirth("25.03.2008");
        reader3.setFaculty("Филология");
        reader3.setNumberofticket(3);
        reader3.setPhone("+380675462547");


        System.out.println(book1.getinfo());
        System.out.println(book2.getinfo());
        System.out.println(book3.getinfo());

        System.out.println(reader1.getinfo());
        System.out.println(reader2.getinfo());
        System.out.println(reader3.getinfo());

        reader1.takeBook(reader1.getFullname());

        reader1.takeBook(reader1.getFullname()+" взял книги: "+book1.getName()+", "+ book2.getName()+", " + book3.getName()+". ");

        reader1.takeBook(reader1.getFullname()+" взял книги: "+book1.getName()+", "+ book2.getName()+", " + book3.getName()+". ");

        reader1.takeBook(reader1.getFullname() + " взял книги: " + book1.getName() + "(" + book1.getAvtor() + " " + book1.getDate() + "), "
                + book2.getName() + "(" + book2.getAvtor() + " " + book2.getDate() + "), " + book3.getName() + "(" + book3.getAvtor() + " " + book3.getDate() + ").");

        reader1.returnBook(reader1.getFullname());

        reader1.returnBook(reader1.getFullname()+" вернул книги: "+book1.getName()+", "+ book2.getName()+", " + book3.getName()+". ");

        reader1.returnBook(reader1.getFullname() + " вернул книги: " + book1.getName() + "(" + book1.getAvtor() + " " + book1.getDate() + "), "
                + book2.getName() + "(" + book2.getAvtor() + " " + book2.getDate() + "), " + book3.getName() + "(" + book3.getAvtor() + " " + book3.getDate() + ").");
    }
}
