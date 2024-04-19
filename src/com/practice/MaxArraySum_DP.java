package com.practice;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxArraySum_DP {
    // Complete the maxSubsetSum function below.

    /***
     * * Given an array of integers, find the subset of non-adjacent elements with the maximum sum. Calculate the sum of that subset.
     * * It is possible that the maximum sum is , the case when all elements are negative.
     * * Example: The following subsets with more than  element exist. These exclude the empty subset and single element subsets which are also valid.

     Subset      Sum
     [-2, 3, 5]   6
     [-2, 3]      1
     [-2, -4]    -6
     [-2, 5]      3
     [1, -4]     -3
     [1, 5]       6
     [3, 5]       8
     The maximum subset sum is . Note that any individual element is a subset as well.
     In this case, it is best to choose no element: return 0.

     ***/
    static int maxSubsetSum(int[] arr) {

        Arrays.stream(arr).forEach(System.out::println);

//        HashMap<List<Integer>,Integer> subsetSum = new HashMap<>();
//        List<Integer> subsetList;
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i+2; j< arr.length ; j++){
//                subsetList = new ArrayList<>();
//                subsetList.add(arr[i]);
//                subsetList.add(arr[j]);
//                int sum = arr[i] + arr[j];
//                subsetSum.put(subsetList, sum);
//            }
//        }
//        System.out.println("Subset keys: " + subsetSum.keySet());
//        System.out.println("Subset keys: " + subsetSum.values());
//
//        System.out.println(subsetSum.values().stream().max(Comparator.comparing(i -> i)).get());
//
//        return subsetSum.values().stream().max(Comparator.comparing(i -> i)).get();
        int [] result = new int[arr.length];
        result[0] = arr[0];
        result[1] = Math.max(arr[0], arr[1]);
        for( int i = 2; i< arr.length; i++){
            int sum = arr[i] + result[i-2];
            result[i] = Math.max(Math.max(sum, result[i-1]),arr[i]);
        }

        return result[arr.length-1];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[n];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }

        int arr [] = {2,1,3,4,5};
        int res = maxSubsetSum(arr);

//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
        scanner.close();
    }
}
