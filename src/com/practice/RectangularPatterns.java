package com.practice;

public class RectangularPatterns {

    public static void patternOne(int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternTwo(int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void patternThree(int m, int n) {

        int count = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (count < 10) {
                    System.out.print("0" + count++ + " ");
                } else {
                    System.out.print(count++ + " ");
                }
            }
            System.out.println();
        }
    }

    public static void patternFour(int m, int n) {

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i * j < 10) {
                    System.out.print("0" + i * j + " ");
                } else {
                    System.out.print(i * j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void patternFive(int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }

    public static void patternSix(int m, int n) {

        //either use count variable or u can use directly the value to print
        for (int i = 0; i < m; i++) {
//            int count = i + 1;
            for (int j = 0; j < n; j++) {
                System.out.print((i+1+j) + " ");
            }
            System.out.println();
        }
    }

    public static void patternSeven(int m) {

        //either use count variable or u can use directly the value to print
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // write your code here
        System.out.println("Pattern 1: ");
        patternOne(7, 7);
        System.out.println("Pattern 2: ");
        patternTwo(7, 7);
        System.out.println("Pattern 3: ");
        patternThree(7, 7);
        System.out.println("Pattern 4: ");
        patternFour(7, 7);
        System.out.println("Pattern 5: ");
        patternFive(7, 7);
        System.out.println("Pattern 6: ");
        patternSix(7, 7);

        System.out.println("Pattern 7: ");
        patternSeven(7);
    }

}
