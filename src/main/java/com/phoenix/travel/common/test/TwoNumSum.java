package com.phoenix.travel.common.test;

import java.util.HashMap;
import java.util.Map;

public class TwoNumSum {


    public static void main(String[] args) {

        int[] arr = {12, 33, 5, -7};

        forceMethod(arr, 17);
        hashTwiceMethod(arr, 17);
        hashOnceMethod(arr, 17);
    }

    /**
     * 暴力法
     *
     * @param nums
     * @param target
     * @return
     */
    static int[] forceMethod(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int min = target - nums[i];
                if (min == nums[j]) {
                    System.out.printf("找到了，两个数字分别是{%s,%s}，下标分别是{%s,%s}\r\n", nums[i], nums[j], i, j);
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 两遍哈希表
     *
     * @param nums
     * @param target
     * @return
     */
    static int[] hashTwiceMethod(int[] nums, int target) {
        Map<Integer, Integer> hashTable = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashTable.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int min = target - nums[i];
            if (hashTable.containsKey(min) && hashTable.get(min) != i) {
                System.out.printf("找到了，两个数字分别是{%s,%s}，下标分别是{%s,%s}\r\n", nums[i], min, i, hashTable.get(min));
                return new int[]{i, hashTable.get(min)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 一次哈希表
     *
     * @param nums
     * @param target
     * @return
     */
    static int[] hashOnceMethod(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int min = target - nums[i];
            if (map.containsKey(min)) {
                System.out.printf("找到了，两个数字分别是{%s,%s}，下标分别是{%s,%s}\r\n", nums[i], min, i, map.get(min));
                return new int[]{i, map.get(min)};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }


}
