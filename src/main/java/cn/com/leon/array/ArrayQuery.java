package cn.com.leon.array;

import org.omg.DynamicAny._DynAnyFactoryStub;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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

    public static Integer[] queryElements(int[] arr, int... targets){
        Integer[] indexArr = new Integer[]{};
        List<Integer> indexList = new ArrayList<Integer>();
        for (int index = 0;index < arr.length;index++){
            for (int target : targets){
                if (target == arr[index]){
                    indexList.add(index);
                }
            }
        }
        return indexList.toArray(indexArr);
    }


    /**
     * 获取int型数组的最大值
     * @param arr
     * @return
     */
    public static int getMax(int[] arr){
        //假设最大值为第一项 若有比
        int max = arr[0];
        for (int i = 0;i<arr.length;i++ ){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取最大值下标
     * @param arr
     * @return
     */
    public static int getMaxIndex(int[] arr){
        //假设最大值为第一项 若有比
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0;i<arr.length;i++ ){
            if (arr[i]>max){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * 二分法查找指定的数(有序数组)
     * @param arr
     * @param firstIndex
     * @param finalIndex
     * @param target
     * @return
     */
    public static int dichotomy(int[] arr,int firstIndex,int finalIndex,int target){
        if (arr == null || arr.length == 0){
            return -1;
        }else if (firstIndex < finalIndex){
            //求出中间点
            int middleIndex = (firstIndex + finalIndex)/2;
            //目标值和中间值作比较
            if (arr[middleIndex] == target){
                return middleIndex;
            }
            //中间值大于目标值则选取左侧区间
            if (arr[middleIndex] > target){
                return dichotomy(arr,firstIndex,middleIndex,target);
            }
            if (arr[middleIndex] < target){
                return dichotomy(arr,middleIndex,finalIndex,target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Object[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Object[] elementArr = {1, 3, 5, 7, 9};
        /**
         * test queryElements
         */
        System.out.println("test query elements");
        Integer[] result = ArrayQuery.queryElements(arr, elementArr);
        System.out.println(Arrays.toString(result));
        /**
         * test get max
         */
        System.out.println("test get max");
        int[] array = {-1, 2, -3, 4, -5, 6, 0, 6};
        System.out.println(getMax(array));
        /**
         * test get max index
         */
        System.out.println("test get max index");
        System.out.println(getMaxIndex(array));
        /**
         * test dichotomy
         */
        System.out.println("test dichotomy");
        int[] sortArr = {1, 3, 4, 6, 7, 9, 11, 43, 66, 88, 192, 200};
        System.out.println(dichotomy(sortArr, 0, sortArr.length, 3));
    }
}
