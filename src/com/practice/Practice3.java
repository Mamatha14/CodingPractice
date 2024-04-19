package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'whatFlavors' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY cost
     *  2. INTEGER money
     */

    public static void whatFlavors(List<Integer> cost, int money) {
        // Write your code here
        Map<Integer, List<Integer>> choice = IntStream.range(0, cost.size()).boxed().collect(Collectors.groupingBy(cost::get));

        System.out.println("Map: " + choice);
        for (int i = 0; i < cost.size(); i++) {
            int flavor1 = cost.get(i);
            int flavor2 = money - cost.get(i);
            int sum = flavor1 + flavor2;
            if (sum == money && cost.contains(flavor2)) {
                int pos1 = cost.indexOf(flavor1) + 1;
                System.out.println("flavor1: " + flavor1);
                System.out.println("flavor2: " + flavor2);
                int pos2 = cost.indexOf(flavor2) + 1;
                System.out.println("pos1: " + pos1);
                System.out.println("pos2: " + pos2);
                if (pos1 != pos2) {
                    System.out.println(pos1 + " " + pos2);
                    break;
                }
            }
        }
    }
}

public class Practice3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int money = Integer.parseInt(bufferedReader.readLine().trim());

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> cost = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                Result1.whatFlavors(cost, money);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
