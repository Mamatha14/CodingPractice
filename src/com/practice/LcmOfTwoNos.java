package com.practice;

import java.util.Scanner;

public class LcmOfTwoNos {

    //brute force approach --> time complexity is O(a*b - max(a,b))
    static int bruteForceLcm(int a, int b){
        int res = Math.max(a,b);

        while(true){
            if(res % a == 0 && res % b == 0){
                break;
            }
            res++;
        }
        return res;
    }

    //optimised approach using mathematical approach --> time complexity is same as optimised GCD's ie., O(log(min(a,b))
    //lcm(a,b) = a*b / gcd(a,b) --> finding gcd using optimised euclid's algo
    static int optimisedLcm(int a, int b){
        return a*b / GcdOfTwoNos.optimizedEuclidGcd(a, b);
    }

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM using brute force approach: " + bruteForceLcm(a, b));
        System.out.println("LCM using mathematical relation: " + optimisedLcm(a, b));
    }

}
