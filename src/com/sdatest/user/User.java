package com.sdatest.user;

public class User {
    String name;
    String lastName;

    public User(String name, String lastName)
    {
        this.name = name;
        this.lastName = lastName;
    }

    public void welcome()
    {
        System.out.println("Dzień dobry " + name + " " + lastName + "!");
        System.out.println("Życze szczęścia i wysokich wygranych!");
    }
}
