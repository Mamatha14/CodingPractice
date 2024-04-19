package com.practice;

public class TriangularPatterns {

    public static void patternOne(int m) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternTwo(int m) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternThree(int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void patternFour(int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int k = 0; k <= m-i; k++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void patternFive(int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int k = 0; k <= m-i; k++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void patternSix(int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int k = 0; k < (m-i)/2; k++){
                System.out.print("-");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int k = ((m-i)/2) +1; k < m-i; k++){
                System.out.print("-");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        // write your code here
//        System.out.println("Pattern 1 - Right Angled Triangle: ");
//        patternOne(7);
//        System.out.println("Pattern 2 - Right Angled Triangle: ");
//        patternTwo(7);
//        System.out.println("Pattern 3: ");
//        patternThree(7, 7);
//        System.out.println("Pattern 4: ");
//        patternFour(7, 7);
        System.out.println("Pattern 5: ");
        patternFive(7, 7);
        System.out.println("Pattern 6: ");
        patternSix(7, 7);
    }

}
