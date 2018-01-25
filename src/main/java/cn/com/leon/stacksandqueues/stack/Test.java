package cn.com.leon.stacksandqueues.stack;

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
        /**
         * test word reverse
         */
        System.out.println("test word reverse");
        WordsReverse wordsReverse = new WordsReverse();
        System.out.println(wordsReverse.doReverse("hello"));
        /**
         * test separator match
         */
        System.out.println("test separator match");
        SeparatorMatch separatorMatch = new SeparatorMatch();
        separatorMatch.match("1{a[b]}");
        separatorMatch.match("1{a[b]})");
        separatorMatch.match("1{a(b]}");
        separatorMatch.match("1[{a(b)}");
    }
}