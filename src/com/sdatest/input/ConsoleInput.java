package com.sdatest.input;

import com.sdatest.user.User;

import java.util.Scanner;

public class ConsoleInput {
    public static User getUserData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj! Podaj swoje imię:");
        String name = scanner.nextLine();
        System.out.println("Podaj proszę swoje nazwisko:");
        String lastName = scanner.nextLine();

        return new User(name, lastName);
    }
}
