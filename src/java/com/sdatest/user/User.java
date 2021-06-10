package com.sdatest.user;

public class User {
    String name;
    String lastName;

    public User(String name, String lastName)
    {
        this.name = name;
        this.lastName = lastName;
    }

    public String welcome()
    {
        if (name == null || lastName == null || name.isEmpty() || lastName.isEmpty())
        {
            return "Niepoprawne dane";
        } else {
            return "Dzień dobry " + name + " " + lastName + "!";
        }
    }
}
