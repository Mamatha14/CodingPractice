package com.practice;

import java.util.Scanner;

public class PrintDivisors {

    //Brute Force Approach --> time complexity O(n)
    static void printDivisors(int n){

        for(int i = 1; i <= n ; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }

    }

    //Brute Force Approach --> time complexity O(sqrt(n))
    static void printDivisorsEfficient(int n){
        for(int i = 1; i * i <= n ; i++){
            if(n%i == 0){
                System.out.println(i); // gives 1st divisor
                if(i != n/i) {
                    System.out.println(n/i); // gives 2nd divisor using equation a = b/n here it is n/i
                }
            }
        }
    }

    //Brute Force Approach --> time complexity O(sqrt(n) + O(sqrt(n) = O(sqrt(2n)) = O(sqrt(n))
    static void printDivisorsAscendingOrder(int n){
        int i;
        for(i = 1; i * i <= n ; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
        for (; i >= 1; i--) {
            if (n % i == 0 && i != n/i) {
                System.out.println(n/i);
            }
        }
    }

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Brute Force Approach: ");
        printDivisors(n);
        System.out.println("Optimised Approach: ");
        printDivisorsEfficient(n);
        System.out.println("Printing in ascending order: ");
        printDivisorsAscendingOrder(n);
//        System.out.println("Printing in descending order: ");
//        printDivisorsDescendingOrder(n);
    }
}
