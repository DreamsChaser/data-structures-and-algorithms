package cn.com.leon.sort;

import java.util.Arrays;

/**
 * @author leon
 *         选择排序
 */
public class SelectSort {

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        int temp = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
            min++;
        }
    }

    public static void main(String[] args) {
        int[] source = {21, 12, 3, 11, 9, 37, 10, 99, 14, 2, 32, 123, 21};
        SelectSort.selectSort(source);
        System.out.println(Arrays.toString(source));
    }
}
