package cn.com.leon.array;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author leon
 */
public class ArrayDelete {

    /**
     * 删除数组中某些位置元素 并返回新的数组
     * @param arr
     * @param index
     * @return
     */
    public static Object[] delete(Object[] arr,int... index){
        //将将要删除的下表排序
        Arrays.sort(index);
        int instant = 0;
        for (int i : index){
            //每循环一次要把删除的下标减一，确保删除正确位置的值
            arr = delete(arr,i-instant);
            instant++;
        }
        return arr;
    }

    /**
     * 删除数组中某位置元素 并返回新的数组
     * @param arr
     * @param index
     * @return
     */
    public static Object[] delete(Object[] arr,int index){
        int length = arr.length;
        //下标越界错误
        if (index<0||index>length){
            throw new ArrayIndexOutOfBoundsException("index:"+index+",length:"+length);
        }
        //构建一个数组长度小一的数组
        Object result = Array.newInstance(arr.getClass().getComponentType(),length-1);
        //先复制0-index之间的数，然后将index之后的数组复制过去
        //System.arraycopy方法:
        // 源数组中位置在 srcPos 到 srcPos+length-1 之间的组件被分别复制到目标数组中的 destPos 到 destPos+length-1 位置。
        System.arraycopy(arr,0,result,0,index);
        if (index < length-1){
            System.arraycopy(arr,index+1,result,index,length-index-1);
        }
        return (Object[]) result;
    }

    /**
     * 删除数组中指定元素 并返回新的数组
     * @param arr
     * @param object
     * @return
     */
    public static Object[] delete(Object[] arr,Object... object){
        //1
        return null;
    }

    public static Object[] delete(Object[] arr,Object object){
        //1循环找到该元素位置
        return null;
    }


    public static void main(String[] args) {
        /**
         * test ArrayUtils.remove
         */
        System.out.println("test ArrayUtils.remove");
        int[] arr = new int[]{1,2,3,4,4,4,7,8,9,10};
        int[] arrResult = ArrayUtils.remove(arr,9);
        int[] arrResult2 = ArrayUtils.removeElement(arr,4);
        System.out.println(Arrays.toString(arrResult));
        System.out.println(Arrays.toString(arrResult2));
        System.out.println(arrResult.length);
        /**
         * test delete one index
         */
        System.out.println("test delete one index");
        Object[] arr2 = {1,2,3,4,5};
        int[] index = new int[]{3,2};
        System.out.println(Arrays.toString(ArrayDelete.delete(arr2,3)));
        /**
         * test delete some index
         */
        System.out.println("test delete some index");
        System.out.println(Arrays.toString(ArrayDelete.delete(arr2,index)));
    }
}
