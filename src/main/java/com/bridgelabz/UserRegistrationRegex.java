package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationRegex {
   static UserDetails user = new UserDetails();
    static Scanner scanner = new Scanner(System.in);
    public static void getFirstName(){
        System.out.println("enter the first name");
        String firstName = scanner.next();
        boolean check = Pattern.matches("[A-Z]{1}+[a-z]{2,}",firstName);
        if (check){
            user.setFirstName(firstName);
        }
        else {
            System.out.println("First name start with Cap and has minimum 3 characters");
        }
    }
    public static void getLastName(){
        System.out.println("enter the Last name");
        String lastName = scanner.next();
        boolean check = Pattern.matches("[A-Z]{1}+[a-z]{2,}",lastName);
        if (check){
            user.setLastName(lastName);
        }
        else {
            System.out.println("Last name start with Cap and has minimum 3 characters");
        }
    }
    public static void getEmail(){
        System.out.println("enter the email");
        String email = scanner.next();
        boolean check = Pattern.matches("^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$",email);
        if (check){
            user.setEmail(email);
        }
        else {
            System.out.println("Email start with Cap and has minimum 3 characters");
        }
    }
    public static void getPhoneNumber(){
        System.out.println("enter the PhoneNumber");
        String PhoneNumber = scanner.next();
        boolean check = Pattern.matches("^[1-9][0-9][1-9]{10}$",PhoneNumber);
        if (check){
            user.setEmail(PhoneNumber);
            System.out.println("thanks for your input");
        }
        else {
            System.out.println("Phone number invalid , enter correct number");
        }
    }
    public static void main(String[] args) {
       getFirstName();
       getLastName();
       getEmail();
       getPhoneNumber();
    }
}
