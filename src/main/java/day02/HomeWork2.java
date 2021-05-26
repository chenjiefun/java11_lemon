package day02;

import java.util.Arrays;

/**
 * 有如下数组；[4,1,3,2,5],从小到大排序（拓展：冒泡排序）
 *
 */
public class HomeWork2 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2, 5};
        int temp = 0;
        //长度为n的数组需要进行n-1轮冒泡
        for (int i = 0; i < arr.length-1; i++) {
            //完成每一轮冒泡，从第一个数开始，依次将相邻的两个数进行比较每一轮冒泡都能找到剩下来这些数里面最大值放到后面
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
//        for (int i : arr){
//            System.out.println(i);
//        }
    }
}
