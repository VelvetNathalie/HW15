package com.pb.vlasenko.HW8;

import java.util.regex.Pattern;

public class Auth extends OnlineShop {
    String login;
    String password;
    String confirmPassword;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public  void signUp(String login,String password,String confirmPassword)
            throws WrongLoginException,WrongPasswordException
    {
        if (!Pattern.matches("[a-zA-Z_0-9]{5,20}" , login))
       { throw new WrongLoginException ("Login должен быть от 5 до 20 символов,должен содержать только латинские буквы и цифры. ");
       }
    else if (!Pattern.matches( "[a-zA-Z_0-9]{5,}", password))
    {
    throw new WrongPasswordException ("Password должен быть длинee 5 символов, только латинские буквы, цифры и знак подчеркивания.");
    }
    else if (!password.equals(confirmPassword))
    {
    throw new WrongPasswordException("пароли не совпадают");
    }
    else
    {
        System.out.println("регистрация прошла успешно");
    }
    }


    public static void signIn(String login,String password)
            throws WrongLoginException,WrongPasswordException {
        if (!login.equals(login)){
            throw new WrongLoginException ("логин и пароль не совпадают, введите правильные данные: ");}
        if (!password.equals(password)){
            throw new WrongPasswordException("логин и пароль не совпадают, введите правильные данные: ");
        }
        else {
            System.out.println("Поздравляем! Вы вошли на сайт!");
            }
        }


    }

