package cn.com.leon.sort;

import java.util.Arrays;

/**
 * @author leon
 * 冒泡排序
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * @param source
     */
    public static void bubbleSort(int[] source){
        int temp = 0;
        int length = source.length;
        for (int i = 0;i<source.length;i++){
            for (int j = 0;j<length-1;j++){
                if (source[j]>source[j+1]){
                    temp = source[j];
                    source[j] = source[j+1];
                    source[j+1] = temp;
                }
            }
            length--;
        }
    }

    public static void main(String[] args) {
        /**
         * test bubble sort
         */
        int[] source = {21,12,3,11,9,37,10,99,14,2,32,123,21};
        BubbleSort.bubbleSort(source);
        System.out.println(Arrays.toString(source));
    }
}
