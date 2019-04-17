package com.array;


/**
 * Created by xufei
 * 2019/4/16
 */
public class Array<E> {
    private E[] data;
    private int size;

    //构造函数，传入数组的容量capacity构造Array
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    //无参构造函数，默认数组容量capacity=10
    public Array() {
        this(10);
    }

    //获取元素个数
    public int getSize() {
        return size;
    }

    //获取数组容量
    public int getCapacity() {
        return data.length;
    }

    //返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //向数组中添加元素
    public void addLast(E e) {
        add(size, e);
    }

    //向数组中添加元素
    public void addFirst(E e) {
        add(0, e);
    }

    //向index位置插入元素e
    public void add(int index, E e) {
        if (size == data.length)
            throw new IllegalArgumentException("add faild.Array is full");
        if (index < 0 || index > size)
            throw new IllegalArgumentException("add faild.error Index");
        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];

        data[index] = e;
        size++;

    }

    //查看是否包含元素e
    public boolean contains(E e) {
        for (E datum : data) {
            if (datum == e) {
                return true;
            }
        }
        return false;
    }

    //查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (e == data[i])
                return i;
        }
        return -1;
    }

    //删除数组中元素e所在的索引，返回删除的元素
    public E remove(int index) {
        if (size == data.length)
            throw new IllegalArgumentException("add faild.Array is full");
        if (index < 0 || index > size)
            throw new IllegalArgumentException("add faild.error Index");
        E ret = data[index];

        for (int i = index + 1; i < size; i++)
            data[i - 1] = data[i];
        size--;

        return ret;
    }

    //删除第一个元素
    public E removeFirst() {
        return remove(0);

    }

    //删除最后一个元素
    public E removeLast() {
        return remove(size - 1);
    }

    //删除某一个元素
    public boolean removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    public E get(int index){
        if (index < 0 || index > size)
            throw new IllegalArgumentException("add faild.error Index");
        return data[index];
    }

    public E getLast(){
        return get(size - 1);
    }

    public E getFirst(){
        return get(0);
    }
}
