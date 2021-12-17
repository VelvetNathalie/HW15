package com.pb.vlasenko.HW11;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.io.*;
import java.nio.file.Paths;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.Pattern;

public class Telephone {

    public static void main(String[] args) throws Exception {


        ObjectMapper mapper = new ObjectMapper();
        ObjectReader objectReader = mapper.reader().forType(new TypeReference<List<Person>>(){});
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);


        List<Person> list = new ArrayList<>();

        while (true) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите команду: " +"\n"+
                "добавить-1, удалить-2, поиск-3, сортировка по указанному полю-4,"+
                "\n"+ "редактирование элемента-5,после работы с данными: запись в файл всех данных-11," +
                "\n"+"загрузка из файла всех данных-22, выход-6,");
        String command=scan.nextLine();

        if(command.equals("1"))
        {
           System.out.println("name: ");
           String name= scan.nextLine();

            System.out.println("phone: ");
             String phone= scan.nextLine();

            System.out.println("adress: ");
            String adress=scan.nextLine();

            System.out.println("date: ");
          int date= scan.nextInt();

            System.out.println("month: ");
            int month=scan.nextInt();

            System.out.println("year: ");
            int year=scan.nextInt();

            try {Person.dateIn(date,month,year); }
            catch (WrongYearException e){System.out.println("введите целое число (год рождения)");}
            catch (WrongMonthException e){System.out.println("введите целое число (номер месяца рождения)");}
            catch (WrongDateExceptions e) {System.out.println("введите целое число (день рождения)");}
            catch (DateTimeException e) {System.out.println("введите правильную дату");}

            LocalDate DateOfBirth=LocalDate.of(year,month,date);


            Person person = new Person(name,phone,DateOfBirth,adress, LocalDateTime.now());

            list.add(person);
            System.out.println(list);
            List personsJson = Collections.singletonList(mapper.writeValueAsString(list));
            System.out.println(personsJson);

            continue;
        }
        if  (command.equals("2")){
            System.out.println("введите значение элемента для удаления: ");
            String command2=scan.nextLine();
            int lenght=list.size();
            for(int i=0; i<lenght; i++)
            {
                if (list.get(i).getName().equals(command2)){list.get(i).setName(null);
                {
                    System.out.println("элемент удален в списке "+ " с номером телефона: "+ list.get(i).getPhone()+" .");
                    System.out.println(list);
                }}

               if (list.get(i).getAdress().equals(command2)){

               list.get(i).setAdress(null);
                   {System.out.println("элемент удален в списке"+ "с именем:  "+ list.get(i).getName()+" .");
                   System.out.println(list);
              }}

               if (list.get(i).getPhone().equals(command2)){list.get(i).setPhone(null);
              {System.out.println("элемент удален в списке"+ " с именем:  "+ list.get(i).getName()+" .");
                  System.out.println(list);
               }}

              if (list.get(i).getDateOfBirth().equals(command2)){list.get(i).setDateOfBirth(null);
               {System.out.println("элемент удален в списке"+ " с именем "+ list.get(i).getName()+" .");
                   System.out.println(list);

              }}

          }

            continue;
        }

          if  (command.equals("3"))
          {System.out.println("введите значение элемента для поиска: имя, адрес, телефон, дату рождения. ");
              Object command1=scan.nextLine();
              int lenght=list.size();
              for(int i=0; i<lenght; i++)
              {
                  if (list.get(i).getName().equals(command1))
                  {System.out.println("элемент есть в списке "+ " "+ list.get(i).getName()+", все данные пользователя: "+ list.get(i));}
                  //else {System.out.println("данные не найдены, попробуйте найти по другому значению ");}continue;
                  if (list.get(i).getAdress().equals(command1))
                  {System.out.println("элемент есть в списке"+ " "+ list.get(i).getName()+", все данные пользователя: "+ list.get(i));}
                  //else {System.out.println("данные не найдены, попробуйте найти по другому значению ");}continue;
                  if (list.get(i).getPhone().equals(command1))
                      {System.out.println("элемент есть в списке"+ " "+ list.get(i).getName()+", все данные пользователя: "+ list.get(i));}
                  //else {System.out.println("данные не найдены, попробуйте найти по другому значению ");}continue;
                  if (list.get(i).getDateOfBirth().equals(command1))
                      {System.out.println("элемент есть в списке"+ " "+ list.get(i).getName()+", все данные пользователя: "+ list.get(i));}
                  //else {System.out.println("данные не найдены, попробуйте найти по другому значению ");}
                  }

            continue;
          }
            if(command.equals("4"))
            {System.out.println(" для сортировки по имени введите 1, по адресу введите 2.");
               String command3=scan.nextLine();
               if (command3.equals("1")){
               list.sort(new Comparator<Person>()
                   {
                            @Override
                            public int compare(Person o1, Person o2)
                            {return o1.getName().compareTo(o2.getName());}

                    });

                   System.out.println("сортировка по имени: "+list);
                    }
            if (command3.equals("2")){list.sort(new Comparator<Person>()
            {
                @Override
                public int compare(Person o1, Person o2)
                {return o1.getAdress().compareTo(o2.getAdress());}

            });
                System.out.println("сортировка по адресу: "+list);
            }}
if(command.equals("5"))
{System.out.println("введите значение элемента для редактирования: ");
            String command5=scan.nextLine();
            System.out.println("введите новое значение элемента: ");
            String command4=scan.nextLine();
            int lenght=list.size();
            for(int i=0; i<lenght; i++)
            {
                if (list.get(i).getName().equals(command5)){
                    list.get(i).setName(command4);
                    {
                        System.out.println("имя отредактировано в списке "+ " с номером телефона: "+ list.get(i).getPhone()+" .");
                        System.out.println(list);
                    }}

                if (list.get(i).getAdress().equals(command5)){

                    list.get(i).setAdress(command4);
                    {System.out.println("элемент отредактирован в списке"+ "с именем:  "+ list.get(i).getName()+" .");
                        System.out.println(list);
                    }}

                if (list.get(i).getPhone().equals(command5)){list.get(i).setPhone(command4);
                    {System.out.println("элемент отредактирован в списке"+ " с именем:  "+ list.get(i).getName()+" .");
                        System.out.println(list);
                    }}

                //if (list.get(i).getDateOfBirth().equals(command4)){list.get(i).setDateOfBirth(command4);
                    //{System.out.println("элемент отредактирован в списке"+ " с именем "+ list.get(i).getName()+" .");
                       // System.out.println(list);
                  //  }}
                //else {System.out.println("данные не найдены, попробуйте найти по другому значению ");}
            }

            continue;
        }

            if(command.equals("11"))
            {
                try (FileWriter writer=new FileWriter("com.pb.vlasenko.HW11.telephone.txt",false))
                {System.out.println("файл создан");
                writer.write(String.valueOf(list));
                    //long timestamp = Person.lastModified(list);
                   // long timestamp=writer.lastModified();
                    //System.out.println("telephone.txt последний раз был изменен = " + new Date(timestamp));
                    }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            }

            if (command.equals("22"))
            { try(FileReader reader = new FileReader("com.pb.vlasenko.HW11.telephone.txt"))
            {

                int c;
                while((c=reader.read())!=-1){

                    System.out.print((char)c);
                }
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
            }


            if(command.equals("6")){break; }

// сохраняем в файл
     //   objectOutputStream.writeObject(list);

        //закрываем поток и освобождаем ресурсы
        //objectOutputStream.close();

       // long timestamp = file.lastModified();
      // System.out.println("person.data последний раз был изменен = " + new Date(timestamp));

}

    }

}

