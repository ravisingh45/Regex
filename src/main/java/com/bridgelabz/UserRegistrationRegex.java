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
            System.out.println("thanks for your input");
        }
        else {
            System.out.println("First name start with Cap and has minimum 3 characters");
        }
    }

    public static void main(String[] args) {
       getFirstName();
    }
}
