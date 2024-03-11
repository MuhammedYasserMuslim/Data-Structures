package com.java.stack;

/** LIFO : Last In First Out */
public class Stack<T> {
    private final T[] stack;
    private int top = -1;

    /** initialization stack and give the size */
    public Stack(int size) {
        this.stack = (T[]) new Object[size];
    }

    /** add element in stack */
    public void push(T value) {
        if (!(top == this.stack.length - 1)) {
            top++;
            stack[top] = value;
        } else
            throw new RuntimeException("stack full in push");
    }

    /** remove last element in stack */
    public void pop() {
        if (!isEmpty())
            top--;
        else
            throw new RuntimeException("stack is empty");

    }

    /** check if stack is empty */
    public boolean isEmpty() {
        return top == -1;
    }

    /** return last element in stack */
    public T getTop() {
        if (!isEmpty())
            return stack[top];
        else
            throw new RuntimeException("stack is empty");
    }

    /** print stack */
    public void print() {
        if (!isEmpty()) {
            for (int i = stack.length - 1; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
        else
            throw new RuntimeException("stack is empty");
    }


}
