package com.practice;

import java.util.Scanner;

public class DecimalToBinary {


    private static String decToBin(int n) {

        String binary = "";
        while(n >= 1){
            int rem = n % 2;
            n = n/2;
            binary = rem + binary;
        }
        return binary;
    }

    private static int binToDec(String bin){

        int powOf2 = 1;
        int sum = 0;
        for(int i = bin.length()-1; i >= 0; i--){
            if(bin.charAt(i) == '1'){
                powOf2 = powOf2 * 2;
                sum += powOf2;
            }
            else{
                powOf2 = powOf2 * 2;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bin = decToBin(n);
        System.out.println("Decimal to Binary: " + bin);
        System.out.println("Binary to Decimal: " + binToDec(bin));

    }
}
