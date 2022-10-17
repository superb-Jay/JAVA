package me.day06.practice;

public class Practice02 {
    public static void main(String[] args) {
        int[] nums = new int[100];

        for (int i = 0; i < nums.length ; i++) {
            nums[i] = (int)(Math.random()*100)+1;
        }

        int max = nums[0];

        for (int i = 0; i < nums.length ; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }

        }

        int min = nums[0];

        for (int i = 0; i < nums.length ; i++) {
            if(min > nums[i]) {
                min = nums[i];
            }

        }

        System.out.println("최대값은 ? " + max + "최소값은? " + min);

    }
}
