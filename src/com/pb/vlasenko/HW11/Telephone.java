package com.pb.vlasenko.HW11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Telephone {
    public static void main(String[] args) throws Exception{
        File file = Paths.get("person.data").toFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);


        Person person = new Person(" Natali, ", "0675153058, ", LocalDate.of(1982, 3, 23),
               "Nikolaev, str.Pobedy 23,apt.10.");
        List<Person> list = new ArrayList<>();
    // list.add(new Person("Emilia", "0991244566", LocalDate.of (1982, 3, 23),
                     //"Nikolaev,str.Shkolnaja 5, apt.198" ),


     // list.add(new Person("Emilia", "0991244566", LocalDate.of (1982, 3, 23),
              // "Nikolaev,str.Shkolnaja 5, apt.198" ));
        System.out.println("add person: " + person);

        while (true) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите команду: добавить, удалить, поиск, выход");
        String command=scan.nextLine();

        if(command.equals("добавить"))
        {
         // list.add(new Person("Anna", "5454545", LocalDate.of(1996, 1, 20),
                    // "Nikolaev, str.Pobedy 23,apt.10"));
            System.out.println("name: ");
           scan.nextLine();
          //list.add(person.getName());
           String name1= person.getName();
           // person.setName(String.valueOf(person.getName()));
            System.out.println("phone: ");
            scan.nextLine();
            String phone1= person.getPhone();
           // person.setPhone(String.valueOf(person.getPhone()));
            System.out.println("dateOfBirth: ");
            scan.nextLine();
           LocalDate date=person.getDateOfBirth();
          //  person.setDateOfBirth(LocalDate.parse((CharSequence) person));
            System.out.println("adress: ");
            scan.nextLine();
            String adress1=person.getAdress();
            //person.setAdress(String.valueOf(person.getAdress()));
            System.out.println("Person: "+ name1+phone1+date+adress1);
                    //person.getName()+person.getPhone()+person.getDateOfBirth()+person.getAdress());

            continue;
        }
        if  (command.equals("удалить ")){
            list.remove(person);
            System.out.println("remove person"+list);
            System.out.println(" удалить Person: "+ person.getName()+person.getPhone()+person.getDateOfBirth()+person.getAdress());

            continue;}


            if  (command.equals("поиск "))
            {
                String command1=scan.nextLine();
                System.out.println("введите элемент для поиска: ");
                //command1 = scan.next();
                boolean equals1 = person.equals(command1);
                {System.out.println("person is: "+person.getName());
                }
              continue;
            }
            if(command.equals("выход")){break; }

// сохраняем в файл
      //  objectOutputStream.writeObject(list);

        //закрываем поток и освобождаем ресурсы
       // objectOutputStream.close();

       // long timestamp = file.lastModified();
      //  System.out.println("person.data последний раз был изменен = " + new Date(timestamp));



    //}


}


    //List<Person> persons = Arrays.asList(
          //  new Person("Emilia", "0991244566", LocalDate.of (1982, 3, 23),
              //      "Nikolaev,str.Shkolnaja 5, apt.198" ),
          //  new Person("Natali", "0675153058", LocalDate.of(1982, 3, 23),
                 //   "Nikolaev, str.Pobedy 23,apt.10"),
            //new Person("Anna", "5454545", LocalDate.of(1996, 1, 20),
                   // "Nikolaev, str.Pobedy 23,apt.10")
   // );

//}
    }
}

