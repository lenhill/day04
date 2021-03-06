package com.lenhill;

public class BubbleSort {
    /**
     * 冒泡排序
     * 从小到大
     * @param nums
     */
    public static void bubbleSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];

                    nums[j] = nums[j + 1];

                    nums[j + 1] = temp;

                }
            }
        }
    }

    /**
     * 改进的冒泡排序
     * 设置flag标志，判断排序是否提前结束 避免运行过多次数，优化代码
     * @param nums
     */
    public static void BubbleSortImprove(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            int flag = 0;

            for (int j = 0; j < nums.length - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];

                    nums[j] = nums[j + 1];

                    nums[j + 1] = temp;

                    flag = 1;// 进行了元素交换的标志

                }
            }

            if (flag == 0) {

                break;
            }
        }
    }

    public static void main(String[] args) {

        int nums[] = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };

        // sorting.BubbleSort(nums);
        BubbleSortImprove(nums);

        for (int i = 0; i < nums.length; i++) {

            System.out.print(nums[i] + " ");

        }
    }
}