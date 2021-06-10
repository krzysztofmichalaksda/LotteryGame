package com.sdatest.utils;

public class ArrayHelper {
    public static boolean isNumberExists(int[] table, int number)
    {
        for (int numberInTable : table) {
            if (numberInTable == number) {
                return true;
            }
        }
        return false;
    }
}
