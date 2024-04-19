package com.practice;

import java.util.Scanner;

public class GcdOfTwoNos {

    //brute force approach --> time complexity of O(min(a,b))
    static int gcd(int a, int b){
//        int min = 0;
//        if(a<b){
//            min = a;
//        }
//        else{
//            min = b;
//        }
//        int min = a<b ? a : b;
        int min = Math.min(a,b);
        for(int i = min; i >= 1; i--){
            if((a % i == 0) && (b % i == 0)){
                return i;
            }
        }
        return 1;
    }

    //euclid GCD --> time complexity of O(max(a,b))
    static int euclidGcd(int a, int b){

        while(a != b){

            if(a > b) {
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        return a;
    }

    //optimized euclid GCD by Gabriel Lame--> time complexity of O(log(min(a,b)))
    static int optimizedEuclidGcd(int a, int b){

        while(a != 0 && b != 0){
            if(a > b) {
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        if(a != 0) {
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD using brute force approach: " + gcd(a, b));
        System.out.println("GCD using Euclid approach: " + euclidGcd(a, b));
        System.out.println("GCD using Optimised Euclid approach: " + optimizedEuclidGcd(a, b));
    }
}
