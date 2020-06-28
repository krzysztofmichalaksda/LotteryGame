package com.sdatest.engine;

import java.util.Arrays;
import java.util.Random;

public class LotteryEngine {
    int start;
    int end;
    int count;

    public LotteryEngine(int start, int end, int count) {
        this.start = start;
        this.end = end;
        this.count = count;
    }

    public int[] getMultipleInts()
    {
        int[] randomNumbers = new int[count];

        for (int i = 0; i < randomNumbers.length; i++)
        {
            int randomNumber;
            do {
                randomNumber = getRandomNumber();
            } while (Arrays.binarySearch(randomNumbers, randomNumber) > -1);
            randomNumbers[i] = randomNumber;
        }

        return randomNumbers;
    }

    public int getRandomNumber()
    {
        Random random = new Random();
        return random.nextInt(end - start + 1) + start;
    }
}
