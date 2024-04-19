package com.practice;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        // write your code here

        //Solution 1
        printFizzBuzz(15);

        //Solution 2 --> IntStream to generate numbers specified in the range
        IntStream.rangeClosed(1, 15)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }

    public static void printFizzBuzz(int n) {
        for (Integer i = 1; i <= 10; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if ((i % 3 == 0)) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
