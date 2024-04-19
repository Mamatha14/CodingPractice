package com.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Practice1 {
    /***
     Given: An array of weights and a target weight
     Task: Check if the array contains two values that are equal to the target weight
     **/

    public static void main(String[] args) {
        int[] arrayList = {1, 2, 3, 4, 5};
        int[] result = twoSum(arrayList, 8);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

//        IntStream intStream = Arrays.stream(nums).map(i -> IntStream.rangeClosed(i + 1, nums.length)
//                .mapToObj(j -> (nums[i] + nums[j] == target) ? new int[]{i, j} : new int[]{}));
//        return intStream;

        return new int[]{};
    }

}
