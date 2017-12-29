package cn.com.leon.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon
 */
public class ArrayQuery {

    /**
     * 返回元素所在下标
     * @return
     */
    public static Integer[] queryElements(Object[] arr, Object... objects){
        Integer[] indexArr = new Integer[]{};
        List<Integer> indexList = new ArrayList<Integer>();
        for (int index = 0;index < arr.length;index++){
            for (Object object : objects){
                if (object.equals(arr[index])){
                    indexList.add(index);
                }
            }
        }
        return indexList.toArray(indexArr);
    }


    public static void main(String[] args) {
        Object[] arr = {1,2,3,4,5,6,7,8,9,10};
        Object[] elementArr = {1,3,5,7,9};
        /**
         * test queryElements
         */
        System.out.println("test query elements");
        Integer[] result = ArrayQuery.queryElements(arr,elementArr);
        System.out.println(Arrays.toString(result));
    }
}
