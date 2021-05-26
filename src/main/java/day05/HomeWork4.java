package day05;

import java.util.Arrays;

public class HomeWork4 {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 4, 1, 3};
        int[] arr2 = {9,1,20,99,100};
        int[] arr3 = {88,1001,2003,200};
        HomeWork4 homeWork4 = new HomeWork4();
        homeWork4.bubbleSort(arr1);
        homeWork4.bubbleSort(arr2);
        homeWork4.bubbleSort(arr3);
    }

    /**
     * 参数定义在这里，你想要哪个参数直接传就可以了
     * @param arr
     */

    public void bubbleSort(int []  arr) {

        int temp = 0;
        //长度为n的数组需要进行n-1轮冒泡
        for (int i = 0; i < arr.length - 1; i++) {
            //完成每一轮冒泡，从第一个数开始，依次将相邻的两个数进行比较每一轮冒泡都能找到剩下来这些数里面最大值放到后面
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        /**
         * 打印输出为数组,Arrays
         */
        System.out.println(Arrays.toString(arr));
//        for (int i : arr) {
//            System.out.println(i);
//        }
    }
}

