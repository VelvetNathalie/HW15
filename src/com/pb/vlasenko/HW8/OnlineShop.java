package com.pb.vlasenko.HW8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth auth = new Auth();


        System.out.println("Для регистрации на сайте введите login: ");
        Scanner scan = new Scanner(System.in);
        String login2 = scan.nextLine();
        // login2= auth.getLogin();

        System.out.println("Для регистрации на сайте введите password: ");
        String password2 = scan.nextLine();
        // password2=auth.getPassword();
        System.out.println("Для регистрации Повторите пароль: ");
        String confirmpassword2 = scan.nextLine();


        try {
            auth.signUp(login2, password2, confirmpassword2);
        } catch (WrongLoginException e1) {
            System.out.println("Login должен содержать только латинские буквы и цифры.");
            System.out.println("Login должен быть от 5 до 20 символов.");
        } catch (WrongPasswordException e2) {
            System.out.println("password должен быть длинee 5 символов, только латинские буквы, цифры и знак подчеркивания.");
            System.out.println("password должен быть длинee 5 символов");
        }


        System.out.println("Введите Login для авторизации: ");
        String login3 = scan.nextLine();
        if (login3.equals(login2)) {
            login3 = login2;
        }
        System.out.println("для авторизации на сайте введите password: ");
        String password3 = scan.nextLine();
        if (password3.equals(password2)) {
            password3 = password2;
        }


        try {
            auth.signIn(login3, password3);
                   } catch (WrongLoginException e) {
            System.out.println("Логин и пароль не совпадают, введите правильные данные: ");
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            System.out.println("Логин и пароль не совпадают, введите правильные данные: ");
            e.printStackTrace();
        }
        if (login3.equals(login2)) {
            System.out.println("Поздравляем!");
        } else if (password3.equals(password2)) {
            System.out.println("Вы вошли на сайт!");
        }
    }
    }

