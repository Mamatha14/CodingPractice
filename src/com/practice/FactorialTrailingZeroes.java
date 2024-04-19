package com.practice;

import java.util.Scanner;

public class FactorialTrailingZeroes {

    //Using the series n! = n/5 + n/25 + n/125 + n/625 + .... + infinity
    static int trailingZeroes(int n) {
        int result = 0;
        int powOf5 = 5;

        while (n >= powOf5) {
            result += n / powOf5;
            powOf5 *= 5;
        }
        return result;
    }

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Trailing 0's for the specified factorial: " + trailingZeroes(n));
    }
}
