package com.bridgelabz;

public class UserDetails {
    public  String FirstName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "FirstName='" + FirstName + '\'' +
                '}';

    }
}
