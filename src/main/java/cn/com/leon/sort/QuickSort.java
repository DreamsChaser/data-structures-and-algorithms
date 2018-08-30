package cn.com.leon.sort;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.Array;

/**
 * @author sirius
 * @since 2018/8/30
 */
public class QuickSort {

    public static void sort(int[] arr){
        sort(arr,0,arr.length-1);
    }

    public static void sort(int[] arr,int left,int right) {
        if (left < right) {
            int i = left;
            int j= right;
            int middle = arr[i];
            while (i < j) {
                //左边有坑的时候右边取数填
                while (i<j && arr[j] >= middle) {
                    j--;
                }
                if (i<j) {
                    arr[i++] = arr[j];
                }
                //右边有坑从左边取
                while (i<j && arr[i] < middle) {
                    i++;
                }
                if (i<j) {
                    arr[j--] = arr[i];
                }
            }
            //只剩中间的坑把middle填入
            arr[i] = middle;
            sort(arr,left,i-1);
            sort(arr,i+1,j);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{37, 40, 38, 42, 461, 5, 7, 9, 12};
//        int[] arr = new int[]{12,9,7,5};
        System.out.println(JSON.toJSONString(arr));
        QuickSort.sort(arr);
        System.out.println(JSON.toJSONString(arr));
    }
}
