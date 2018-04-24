package cn.com.leon.recursion;

/**
 * @author leon
 */
public class Factorial {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
