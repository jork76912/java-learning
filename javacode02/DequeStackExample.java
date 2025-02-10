package com.java_learning.Javacode02;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackExample {
    public static void main(String[] args){
        Deque<String> stack = new ArrayDeque<>();

        // 压栈操作
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // 查看堆栈顶部元素
        System.out.println(stack.peek()); // 输出: Cherry

        // 弹栈操作
        System.out.println(stack.pop()); // 输出: Cherry
        System.out.println(stack); // 输出: [Banana, Apple]

        // 判断堆栈是否为空
        System.out.println(stack.isEmpty()); // 输出: false

        // 获取堆栈大小
        System.out.println(stack.size()); // 输出: 2

        // 清空堆栈
        stack.clear();
        System.out.println(stack.isEmpty()); // 输出: true

        // 使用 offerFirst 和 pollFirst 方法
        stack.offerFirst("Dog");
        stack.offerFirst("Cat");
        stack.offerFirst("Mouse");

        System.out.println(stack.pollFirst()); // 输出: Mouse
        System.out.println(stack.pollFirst()); // 输出: Cat
        System.out.println(stack.pollFirst()); // 输出: Dog
    }
}
