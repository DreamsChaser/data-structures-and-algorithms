package cn.com.leon.stacksandqueues;

import cn.com.leon.stacksandqueues.stack.Stack;

import java.util.Arrays;

/**
 * @author leon
 */
public class Test {
    public static void main(String[] args) {
        /**
         * test stack
         */
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(11);
        stack.push(6);
        stack.push(3);
        stack.push(5);
        System.out.println(Arrays.toString(stack.getStackValue()));
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}