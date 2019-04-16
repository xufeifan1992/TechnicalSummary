package com.lambda;

/**
 * Created by xufei
 * 2019/4/13
 */
public class ThreadDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ok");
            }
        }).start();

        new Thread(() -> System.out.println("ok"));
        String str = "123";
    }

}