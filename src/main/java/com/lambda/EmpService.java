package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by xufei
 * 2019/4/13
 */
public class EmpService {

    public List<Emp> filter(List<Emp> listEmp , Predicate<Emp> predicate){
        List<Emp> filterList = new ArrayList<>();
        for (Emp emp :listEmp) {
            if (predicate.test(emp)){
                filterList.add(emp);
            }
        }
        return filterList;
    }
}
