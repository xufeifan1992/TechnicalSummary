package com.array;

/**
 * Created by xufei
 * 2019/4/16
 */
public interface Stack<E> {
    void push(E e);
    E pop();
    boolean isEmpty();
    E peek();
    int getSize();
}
