package cn.com.leon.array;

import java.util.Arrays;

/**
 * @author leon
 */
public class ArrayQuery {
    public static void main(String[] args) {
        int target = 10;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int index = 0;index<arr.length;index++){
            if (arr[index] == target){
                System.out.println(index);
                break;
            }else {
                System.out.println("not found");
            }
        }
    }
}
