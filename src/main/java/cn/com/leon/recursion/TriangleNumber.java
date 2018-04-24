package cn.com.leon.recursion;

/**
 * 递归解决毕达哥拉斯定律 三角数字
 *
 * @author leon
 */
public class TriangleNumber {

    public static int triangleNum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return triangleNum(n - 1) + n;
        }
    }
}
