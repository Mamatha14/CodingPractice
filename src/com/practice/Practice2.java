package com.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Result {
    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static void sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        System.out.println("Given array elements: " + ar);

        //Finding the occurences of each element in the array n putting into map using groupBy ()
        Map<Integer, Long> collect = ar.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println("map size: " + collect.size());
        System.out.println("map keys: " + collect.keySet());
        System.out.println("map values: " + collect.values());

        //for modifying value to the pair
        for (Map.Entry<Integer, Long> e : collect.entrySet()) {
            collect.replace(e.getKey(), (e.getValue() / 2));
        }
        System.out.println("map values: " + collect.values());
        int result = 0;

        //calculating sum of pairs
        for (long value : collect.values()) {
            System.out.println(value);
            result += value;
        }
        System.out.println(result);
//        return result;
    }
}

public class Practice2 {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());

//        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());

        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(1);
        ar.add(2);

        int n = ar.size();

        Result.sockMerchant(n, ar);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
