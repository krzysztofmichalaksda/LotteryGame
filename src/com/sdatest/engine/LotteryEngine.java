package com.sdatest.engine;

import java.util.Random;

public class LotteryEngine {
    int start;
    int end;

    public LotteryEngine(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getRandomNumber()
    {
        Random random = new Random();
        return random.nextInt(end + 1 - start) + start;
    }
}
