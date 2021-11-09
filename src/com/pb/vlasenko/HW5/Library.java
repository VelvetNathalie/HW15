package com.pb.vlasenko.HW5;

public class Library {
    public static void main(String[] args) {
        Book[] books=new Book[3];
             books[0]=new Book(" Иванов И. И. "," Приключения "," 2000 г. ");
             books[1]=new Book(" Сидоров А. В. ", " Словарь "," 1980 г. " );
             books[2]=new Book(" Гусев К. В. ", " Энциклопедия ", " 2010 г. ");


        Reader[] readers = new Reader[3];

        readers[0]=new Reader(" Петров В. В. ", 2," Филология ",
                " 28.07.2009 ", " +380675153058 ");
        readers[1]=new Reader(" Леси Филеберт ",2," Филология ",
                " 11.10.2001 "," +380673256558 ");
        readers[2]=new Reader(" Диана Маш ", 3," Филология ", " 25.03.2008 "," +380675462547 " );



        System.out.println(books[0].getinfo());
        System.out.println(books[1].getinfo());
        System.out.println(books[2].getinfo());

        System.out.println(readers[0].getinfo());
        System.out.println(readers[1].getinfo());
        System.out.println(readers[2].getinfo());


        readers[0].takeBook(3);
        readers[1].takeBook(2);
        readers[2].takeBook(1);

//2

      readers[2].takeBook(" Приключения "," Словарь "," Энциклопедия ");


//3
       readers[1].takeBook(books[1],books[2],books[0]);



        readers[0].returnBook(3);
        readers[1].returnBook(2);
        readers[2].returnBook(1);

        readers[2].returnBook(" Приключения "," Словарь "," Энциклопедия ");


        readers[1].returnBook(books[1],books[2],books[0]);

    }
}
