package com.practice;

import java.util.Scanner;

public class Counter {

    static int countDigits(int n) {
        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n > 0) {
                System.out.println("Number of digits: " + countDigits(n));

                MyLambda countDig = (int a) -> {
                    int c = 0;
                    while (a > 0) {
                        a /= 10;
                        c++;
                    }
                    return c;
                };

                System.out.println("Number of digits - using lambda: " + countDig.get(n));
            } else {
                System.out.println("Please enter +ve number only.");
            }
        }
        catch(Exception e){
            System.out.println("Please enter +ve number only.");
        }

//    MyLambda msg = () -> System.out.println("some msg");
//        msg.get();
    }

}

@FunctionalInterface //Optional but good to use
interface MyLambda{
    int get(int n);
//    void get();
}
