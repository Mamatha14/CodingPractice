package com.practice;

import java.util.Scanner;

import static com.practice.PrimeNumber.checkPrimeNo3;

public class PrimeFactors {

    // this has time complexity of O(n)
    private static void primeFactors(int n) {
        //this will give factors without duplication i.e., for 40,  o/p= 2,5
//        for(int i = 0; i<= Math.sqrt(n); i++){
//            if(checkPrimeNo3(i)){
//                if(n%i == 0){
//                    System.out.println(i);
//                }
//            }
//        }


        //this will give factors with duplication i.e., for 40,  o/p= 2,2,2,5
        int i = 2;
        while(n != 1){
            if(n % i == 0){  //this line can also be replaced by while(n%i ==0) n have increment i after this loop
                System.out.println(i);
                n = n/i;    //Since we are dividing n value, the value of 'i' only be prime factors
            }
            else {
                i++;
            }
        }
    }


    // this has time complexity of O(sqrt(n) log n)
    private static void primeFactorsOptimised(int n) {

        //this will give factors with duplication i.e., for 40,  o/p= 2,2,2,5
        int i = 2;
        while(i*i <= n){
            if(n % i == 0){  //this line can also be replaced by while(n%i ==0) n have increment i after this loop
                System.out.println(i);
                n = n/i;
            }
            else {
                i++;
            }
        }
        if(n > 1){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Brute Force Approach: ");
        primeFactors(n);
        System.out.println("Optimised Approach: ");
        primeFactorsOptimised(n);

    }


}
