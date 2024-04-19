package com.practice;

import java.util.Scanner;

import static com.practice.PrimeNumber.checkPrimeNo3;

public class PrimeNumbersRange {

    //Brute force approach --> Time Complexity O(n * sqrt(n))
    static void rangeOfPrimeNosBruteForce(int n){

        for(int i = 2; i <= n ; i++){
            if(checkPrimeNo3(i)){
                System.out.println(i);
            }
        }
    }

    //Sieve of Eratosthenes approach --> Time Complexity O(n * log(log(n)) approximate to O(n)
    static void rangeOfPrimeNosEratosthenes(int n){

        boolean sieve [] = new boolean[n+1];
        for(int i = 2; i <= n ; i++){
            if(!sieve[i]){
                for(int j = i * 2 ; j <= n; j = j + i){
                    sieve[j] = true;
                }
            }
        }
        for(int i = 2; i <= n;i++){
            if(!sieve[i]) {
                System.out.println(i);
            }
        }
    }

    //Sieve of Eratosthenes approach - optimised --> Time Complexity O(sqrt(n) * log(log(n)) approximate to O(sqrt(n))
    static void eratosthenesOptimised(int n){

        boolean sieve [] = new boolean[n+1];
        for(int i = 2; i*i <= n ; i++){
            if(!sieve[i]){
                for(int j = i * i ; j <= n; j = j + i){
                    sieve[j] = true;
                }
            }
        }
        for(int i = 2; i <= n;i++){
            if(!sieve[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Brute Force Approach: ");
        rangeOfPrimeNosBruteForce(n);
        System.out.println("Sieve of Eratosthenes Approach: ");
        rangeOfPrimeNosEratosthenes(n);
        System.out.println("Sieve of Eratosthenes Approach - Optimised: ");
        eratosthenesOptimised(n);
    }
}
