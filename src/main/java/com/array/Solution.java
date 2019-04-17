package com.array;

import org.junit.Test;

import java.util.Stack;

/**
 * Created by xufei
 * 括号匹配
 * 2019/4/17
 */
public class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if ('(' == aChar || '[' == aChar || '{' == aChar) {
                stack.push(aChar);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
            }
            if (')' == aChar && '(' != (char) stack.pop()) {
                return false;
            }
            if (']' == aChar && '[' != (char) stack.pop()) {
                return false;
            }
            if ('}' == aChar && '{' != (char) stack.pop()) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    @Test
    public void main() {
        String str = "())(";
        boolean valid = isValid(str);
        System.out.println(valid);
    }
}
