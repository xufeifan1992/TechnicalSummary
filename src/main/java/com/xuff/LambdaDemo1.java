package com.xuff;

/**
 * Created by xufei
 * 2019/4/15
 */
interface Interface {
    int doubleNum(int i);
}

public class LambdaDemo1 {
    public static void main(String[] args) {
        //Interface i1 = (i) -> i * 2;
        //Interface i2 = i -> i * 2;
        Interface i3 = i -> {
            System.out.println("123");
            return i * 2;
        };
    }
}
