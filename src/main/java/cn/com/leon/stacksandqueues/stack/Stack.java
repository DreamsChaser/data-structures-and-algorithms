package cn.com.leon.stacksandqueues.stack;

/**
 * @author leon
 *         栈 : 先进后出
 */
public class Stack {

    /**
     * 栈长度
     */
    private int maxSize;
    /**
     * 栈指针
     */
    private int top;

    /**
     * 栈内容
     */
    private Object[] stackValue;

    /**
     * 有参构造
     *
     * @param maxSize
     */
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.stackValue = new Object[maxSize];
    }

    /**
     * 是否栈为空
     *
     * @return
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 是否栈已满
     *
     * @return
     */
    public boolean isFull() {
        return top == maxSize - 1;
    }

    /**
     * 入栈
     *
     * @param value
     */
    public void push(Object value) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("栈已满");
        }
        stackValue[++top] = value;
    }

    /**
     * 出战
     */
    public Object pop() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("栈已空");
        }
        return stackValue[top--];
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public Object[] getStackValue() {
        return stackValue;
    }

    public void setStackValue(Object[] stackValue) {
        this.stackValue = stackValue;
    }
}
