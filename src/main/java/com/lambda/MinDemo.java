package com.lambda;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by xufei
 * 2019/4/13
 */
public class MinDemo {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        /*int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if(num < min){
                min = num;
            }
        }
        System.out.println(min);*/
        int min1 = IntStream.of(nums).min().getAsInt();
        System.out.println(min1);

    }

    @Test
    public void test() {
        List<Emp> list = new ArrayList<>();
        EmpService empService = new EmpService();
        Emp emp = new Emp();
        Emp emp2 = new Emp();
        emp2.setSal(Double.valueOf(300));
        emp.setSal(Double.valueOf(12345));
        list.add(emp);
        list.add(emp2);

        List<Emp> filterSalEmp = empService.filter(list, dou -> dou.getSal() > 3000);
        //List<Emp> filterJobEmp = empService.filter(list, emp3 -> "SALMAN".equals(emp.getJob()));
        System.out.println(filterSalEmp);
    }
}
