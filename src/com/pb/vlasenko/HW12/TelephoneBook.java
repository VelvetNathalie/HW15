package com.pb.vlasenko.HW12;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.pb.vlasenko.HW11.Person;
import com.pb.vlasenko.HW11.WrongDateExceptions;
import com.pb.vlasenko.HW11.WrongMonthException;
import com.pb.vlasenko.HW11.WrongYearException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TelephoneBook {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        ObjectReader objectReader = mapper.reader().forType(new TypeReference<List<Person1>>() {
        });
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer1());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer1());
        mapper.registerModule(module);


        List<Person1> list = new ArrayList<>();

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Напишите команду: " + "\n" +
                    "добавить-1, удалить-2, поиск-3, сортировка по указанному полю-4," +
                    "\n" + "редактирование элемента-5,после работы с данными: запись в файл всех данных-11," +
                    "\n" + "загрузка из файла всех данных-22, выход-6,");
            String command = scan.nextLine();

            if (command.equals("1")) {
                System.out.println("name: ");
                String name = scan.nextLine();

                System.out.println("phone: ");
                String phone = scan.nextLine();

                System.out.println("adress: ");
                String adress = scan.nextLine();

                System.out.println("date: ");
                int date = scan.nextInt();

                System.out.println("month: ");
                int month = scan.nextInt();

                System.out.println("year: ");
                int year = scan.nextInt();

                try {
                    Person.dateIn(date, month, year);
                } catch (WrongYearException e) {
                    System.out.println("введите целое число (год рождения)");
                } catch (WrongMonthException e) {
                    System.out.println("введите целое число (номер месяца рождения)");
                } catch (WrongDateExceptions e) {
                    System.out.println("введите целое число (день рождения)");
                } catch (DateTimeException e) {
                    System.out.println("введите правильную дату");
                }

                LocalDate DateOfBirth = LocalDate.of(year, month, date);


                Person1 person1 = new Person1(name, phone, DateOfBirth, adress, LocalDateTime.now());

                list.add(person1);
                System.out.println(list);
                List personsJson = Collections.singletonList(mapper.writeValueAsString(list));
                System.out.println(personsJson);

                continue;
            }

            if (command.equals("2")) {
                System.out.println("введите значение элемента для удаления: ");
                String command2 = scan.nextLine();
                int lenght = list.size();
                for (int i = 0; i < lenght; i++) {
                    if (list.get(i).getName().equals(command2)) {
                        list.get(i).setName(null);
                        {
                            System.out.println("элемент удален в списке " + " с номером телефона: " + list.get(i).getPhone() + " .");
                            System.out.println(list);
                        }
                    }

                    if (list.get(i).getAdress().equals(command2)) {

                        list.get(i).setAdress(null);
                        {
                            System.out.println("элемент удален в списке" + "с именем:  " + list.get(i).getName() + " .");
                            System.out.println(list);
                        }
                    }

                    if (list.get(i).getPhone().equals(command2)) {
                        list.get(i).setPhone(null);
                        {
                            System.out.println("элемент удален в списке" + " с именем:  " + list.get(i).getName() + " .");
                            System.out.println(list);
                        }
                    }

                    if (list.get(i).getDateOfBirth().equals(command2)) {
                        list.get(i).setDateOfBirth(null);
                        {
                            System.out.println("элемент удален в списке" + " с именем " + list.get(i).getName() + " .");
                            System.out.println(list);

                        }
                    }

                }

                continue;
            }
            if (command.equals("3")) {
                System.out.println("введите значение элемента для поиска: имя, адрес, телефон, дату рождения. ");
                String command1 = scan.nextLine();
                if (list.contains(command1)) {
                    System.out.println("элемент в списке" + " " + list + ".");
                } else {
                    System.out.println("элемент не в списке.");
                }

                System.out.println("----------------------------------------");

            }
            if (command.equals("4")) {
                System.out.println(" для сортировки по имени введите 1, по адресу введите 2.");
                String command3 = scan.nextLine();
                if (command3.equals("1")) {
                    list.stream()
                            .collect(Collectors.groupingBy(Person1::getName))
                            .entrySet()
                            .forEach(System.out::println);
                    System.out.println("----------------------------------------");
                }

                if (command3.equals("2")) {
                    list.stream()
                            .collect(Collectors.groupingBy(Person1::getAdress))
                            .entrySet()
                            .forEach(System.out::println);
                    System.out.println("----------------------------------------");
                }
            }

            if (command.equals("5")) {
                System.out.println("введите значение элемента для редактирования: ");
                Object command5 = scan.nextLine();
                System.out.println("введите новое значение элемента: ");
                Object command4 = scan.nextLine();
                int lenght = list.size();
                for (int i = 0; i < lenght; i++) {
                    for (Person1 s : list) {
                        // if (Objects.equals(s, command5)) (command5.replace(command4);}
                        list.forEach(System.out::println);
                        System.out.println("------------отредактировано в списке------------------" + list);}
                    }

                    continue;}


                    if (command.equals("11")) {
                        try (FileWriter writer = new FileWriter("com.pb.vlasenko.HW12.telephone1.txt", false)) {
                            System.out.println("файл создан");
                            writer.write(String.valueOf(list));

                        } catch (IOException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }

                    if (command.equals("22")) {
                        try (FileReader reader = new FileReader("com.pb.vlasenko.HW12.telephone1.txt")) {

                            int c;
                            while ((c = reader.read()) != -1) {

                                System.out.print((char) c);
                            }
                        } catch (IOException ex) {

                            System.out.println(ex.getMessage());
                        }
                    }


                    if (command.equals("6")) {
                        break;
                    }


                }

            }


            // public boolean equals(Person1 i, Object command1) { if (this == command1) return true;
            //if (command1 == null || getClass() != command1.getClass()) return false;
            // List list = (List) command1;
            //  return i == command1;
        }




