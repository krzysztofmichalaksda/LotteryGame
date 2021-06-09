package com.sdatest;

import com.sdatest.engine.LotteryEngine;
import com.sdatest.input.ConsoleInput;
import com.sdatest.user.User;

import java.util.Arrays;

public class Main {
    final static String TITLE = "LOTTERY GAME";
    final static int MIN_NUMBER = 1;
    final static int MAX_NUMBER = 10;
    final static int COUNT_NUMBER = 4;

    public static void main(String[] args) {
        System.out.println(TITLE);
        // Pobranie danych od użytkownika.
        User user1 = ConsoleInput.getUserData();
        user1.welcome();

        // Pobranie wytypowanych liczb od użytkownika.
        System.out.printf("Podaj %d liczby z zakresu [%d - %d]:\n", COUNT_NUMBER, MIN_NUMBER, MAX_NUMBER);
        int[] userNumbers = ConsoleInput.getUserNumbers(COUNT_NUMBER);
        System.out.println("Twoje wytypowane liczby: " + Arrays.toString(userNumbers));

        // Wylosowanie liczb przez program.
        LotteryEngine lottery = new LotteryEngine(MIN_NUMBER, MAX_NUMBER, COUNT_NUMBER);
        int[] randomNumbers = lottery.getMultipleInts();
        System.out.println("Wylosowane liczby: " + Arrays.toString(randomNumbers));

        // Porównanie liczb wylosowanych i wytypowanych.
        int correctTypes = lottery.getCountOfCorrectTypes(randomNumbers, userNumbers);
        System.out.println("Liczba poprawnie wytypowanych wartości to: " + correctTypes);
    }
}