package cn.com.leon.sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author leon
 */
public class InsertSort {

    /**
     * 插入排序
     *
     * @param arr 数组
     */
    public static void insertSort(int[] arr) {
        int i, j;
        for (i = 1; i < arr.length; i++) {
            int target = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > target) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;
        }
    }

    public static void main(String[] args) {
        int[] source = {1, 21, 12, 3, 11, 9, 37, 10, 99, 14, 2, 32, 123, 21};
        insertSort(source);
        System.out.println(Arrays.toString(source));
    }
}
