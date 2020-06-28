package com.sdatest;

import com.sdatest.engine.LotteryEngine;
import com.sdatest.input.ConsoleInput;
import com.sdatest.user.User;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        User user1 = ConsoleInput.getUserData();
        user1.welcome();
        int count = 4;
        int[] userNumbers = ConsoleInput.getUserNumbers(count);
        System.out.println("Twoje wytypowane liczby: " + Arrays.toString(userNumbers));

        LotteryEngine lottery = new LotteryEngine(1, 20, count);
        int[] randomNumbers = lottery.getMultipleInts();
        System.out.println("Wylosowane liczby: " + Arrays.toString(randomNumbers));
    }
}
