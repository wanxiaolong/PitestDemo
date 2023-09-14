package com.demo;

public class Main {
    // Sum all numbers from 1 to n
    public int calculate(int n) {
        if (n < 2) {
            throw new RuntimeException("Number should be greater than 1");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}