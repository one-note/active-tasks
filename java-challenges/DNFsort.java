package org.example;

import java.util.Arrays;

public class DNFsort {

    public static void main(String[] args) {
        int[] array = {10, 20, 10, 20, 10, 30, 20, 30, 30, 10};
        sortColors(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 10:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 20:
                    mid++;
                    break;
                case 30:
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
