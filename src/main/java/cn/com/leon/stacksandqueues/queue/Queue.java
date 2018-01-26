package cn.com.leon.stacksandqueues.queue;

/**
 * 队列 先进先出
 *
 * @author leon
 */
public class Queue {

    /**
     * 队列内容
     */
    private Object[] queue;

    /**
     * 队列大小
     */
    private int size;

    /**
     * 队列头指针
     */
    private int top;

    /**
     * 队列尾指针
     */
    private int bottom;

    /**
     * 入队列
     *
     * @param value
     */
    public void enque(Object value) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("队列已满");
        }
        if (bottom == size && queue[0] == null) {
            bottom = 0;
        }
        queue[bottom++] = value;
        if (bottom == size && queue[0] == null) {
            bottom = 0;
        }
    }

    /**
     * 出队列
     *
     * @return
     */
    public Object deque() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("队列已空");
        }
        if (bottom == size && queue[0] != null) {
            bottom = 0;
        }
        Object result = queue[top];
        queue[top] = null;
        top++;
        if (top == queue.length && queue[0] != null) {
            top = 0;
        }
        return result;
    }

    public boolean isEmpty() {
        return top - bottom == 0;
    }

    public boolean isFull() {
        return top + bottom == queue.length;
    }


    public Queue(int size) {
        this.queue = new Object[size];
        this.size = size;
        this.top = 0;
        this.bottom = 0;
    }

    public Object[] getQueue() {
        return queue;
    }

    public void setQueue(Object[] queue) {
        this.queue = queue;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }
}
