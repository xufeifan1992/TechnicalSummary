package com.xuff;

import org.junit.Test;

/**
 * Created by xufei
 * 2019/3/31
 * <p>
 * 单向链表实现
 */
public class SingleLinkedList {
    private int size;
    private Node head;

    //节点
    class Node {
        private Object data;//每个节点的数据
        private Node next;//每个节点指向下一个节点的指针

        public Node(Object data) {
            this.data = data;
        }
    }

    //在链表头部添加元素
    public Object addHead(Object obj) {
        Node newHead = new Node(obj);
        if (size == 0) {
            head = newHead;
        } else {
            newHead.next = head;
            head = newHead;
        }
        size++;
        return obj;
    }

    //在单向链表元素中进行删除
    public Object delHead() {
        Object obj = head.data;
        head = head.next;
        size--;
        return obj;
    }

    //查找返回指定节点，找不到返回null
    public Node findHead(Object obj) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (obj.equals(current.data)) {
                return current;
            } else {
                current = current.next;
            }
        }
        return null;
    }

    //删除指定元素，成功返回true
    public boolean delete(Object obj) {
        if (size == 0) {
            return false;
        }

        Node current = head;
        Node previous = head;
        //循环找到当前要删除的节点
        while (!current.data.equals(obj)) {
            if (current.next == null) {
                return false;
            } else {
                //previous要删除的节点的前一个节点
                previous = current;
                current = current.next;
            }
        }
        if (current == head) {
            head = current.next;
            size--;
        } else {
            //把要删除的节点的指针赋给要删除的节点的前一个节点的指针
            previous.next = current.next;
            size--;
        }
        return true;
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    @Test
    public void testLinked() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addHead("1");
        singleLinkedList.addHead("2");
        singleLinkedList.addHead("3");
        singleLinkedList.addHead("4");
        singleLinkedList.addHead("5");

        //singleLinkedList.delete("3");

        singleLinkedList.findHead("3");


    }
}
