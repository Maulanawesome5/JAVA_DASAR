package com.tutorial;

public class SortNumber {

    public static void sort(double[] nums){
        for (int i = 0; i < nums.length; i++){
            int min = i;
            double tmp;

            for (int j = i; j < nums.length; j++){
                if (nums[j] < nums[min]) min = j;
            }
            tmp = nums[i];
            nums[i] = nums[min];
            nums[min] = tmp;
        }
    }

    public static void main(String[] ar){
        // my keyboard error. copy paste -> g, h, '_', "_"
        double[] nums = new double[10]; // create an array to hold numbers
        for (int i = 0; i < nums.length; i++){
            // generate random numbers
            nums[i] = Math.random() * 100;
        }
        sort(nums);
        for (double num : nums) {
            // block ini di koreksi otomatis oleh IntelliJ
            System.out.println(num);
        }
    }
}
