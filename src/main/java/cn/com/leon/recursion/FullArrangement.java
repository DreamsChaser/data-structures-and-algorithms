package cn.com.leon.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列（变位字）
 *
 * @author leon
 */
public class FullArrangement {

    public static List<String> resultList = new ArrayList<String>();


    /**
     * 字符串全排列
     *
     * @param origin
     */
    public static List<String> fullArrangement(List<String> origin, StringBuffer sb) {

        int size = origin.size();
        if (size == 1) {
            sb.append(origin.get(0));
            resultList.add(sb.toString());
            sb.delete(0, sb.length());
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(origin.get(i));
                List<String> list = new ArrayList<String>(origin);
                list.remove(i);
                List<String> tempList = new ArrayList<String>(list);
                fullArrangement(tempList, sb);
            }
        }
        return resultList;
    }

}
