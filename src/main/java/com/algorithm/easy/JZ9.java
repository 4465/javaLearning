package com.algorithm.easy;

import java.util.Stack;

public class JZ9 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while (!stack2.isEmpty()){
                stack2.push(stack1.pop());
            }

        }
        return stack2.pop();
    }

}
