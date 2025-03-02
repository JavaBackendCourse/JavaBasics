package org.lessons.lesson2.arrays;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // одномерный массив
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 4;
        nums[4] = 2;

        // for-loop

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println();

        // for-each
        for (int num : nums) {
            System.out.println(num);
        }

        int length = nums.length;

        System.out.println("Размер массива: " + length);

        int[] numsCopy = Arrays.copyOf(nums, nums.length);

        System.out.println("До сортировки: " + Arrays.toString(numsCopy));
        Arrays.sort(numsCopy);
        System.out.println("После сортировки: " + Arrays.toString(numsCopy));

        // многомерный массив

        int[][] x = new int[5][5];
        x[0] = new int[]{1, 2, 3, 5, 1};
        x[1] = new int[]{7, 5, 6, 2, 3};
        x[2] = new int[]{0, 1, 5, 7, 9};
        x[3] = new int[]{2, 4, 6, 9, 0};
        x[4] = new int[]{3, 5, 7, 10, 3};


        System.out.println("\nДвумерный массив:");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
