package cn.com.leon.stacksandqueues.queue;

import java.util.Arrays;

/**
 * @author leon
 */
public class Test {
    public static void main(String[] args) {
        /**
         *  test queue
         */
        System.out.println("test queue");
        Queue queue = new Queue(5);
        queue.enque(0);
        queue.enque(1);
        queue.enque(2);
        queue.enque(3);
        queue.enque(4);
        System.out.println(Arrays.toString(queue.getQueue()));
        System.out.print(queue.deque());
        System.out.print(queue.deque());
        System.out.println(queue.deque());
        queue.enque(5);
        queue.enque(6);
        System.out.println(Arrays.toString(queue.getQueue()));

    }
}
