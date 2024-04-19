package com.practice;

import java.util.Scanner;

public class PrimeNumber {

    //Approach 1 -->  time complexity is O(n)
    static boolean checkPrimeNo1(int n){

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    //Approach 2 -->  time complexity is O(square_root(n))
    //the first factor can be obtained at or before square_root(n) and no need to go upto n/2 times in for loop

    static boolean checkPrimeNo2(int n){

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    //Approach 3 -->  time complexity is O(square_root(n))
    static boolean checkPrimeNo3(int n){

        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if((n % 2 ==0) || (n % 3 == 0)){
            return false;
        }

        for(int i = 5; i <= Math.sqrt(n); i += 6){
            if((n % i == 0) || (n % (i+2) == 0)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Checking prime no using approach 1 with TS = O(n): " + checkPrimeNo1(n) );
        System.out.println("Checking prime no using approach 2 with TS = O(sqrt(n)): " + checkPrimeNo2(n) );
        System.out.println("Checking prime no using approach 3 with TS = O(sqrt(n)): " + checkPrimeNo3(n) );
    }
}
