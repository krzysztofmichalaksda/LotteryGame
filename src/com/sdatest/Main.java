package com.sdatest;

import com.sdatest.engine.LotteryEngine;
import com.sdatest.input.ConsoleInput;
import com.sdatest.user.User;

public class Main {

    public static void main(String[] args) {
        User user1 = ConsoleInput.getUserData();
        user1.welcome();

        LotteryEngine lottery = new LotteryEngine(-3, 3);
        for(int i=0; i<20; i++) {
            System.out.print(lottery.getRandomNumber() + ", ");
        }

    }
}
