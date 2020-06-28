package com.sdatest;

import com.sdatest.engine.LotteryEngine;
import com.sdatest.input.ConsoleInput;
import com.sdatest.user.User;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        User user1 = ConsoleInput.getUserData();
        user1.welcome();

        LotteryEngine lottery = new LotteryEngine(1, 20, 4);
        int[] randomNumbers = lottery.getMultipleInts();
        System.out.println(Arrays.toString(randomNumbers));
    }
}
