package com.java_learning.Javacode02;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){

        //List<String> linkedList = new LinkedList<>();

        LinkedList<String>linkedList = new LinkedList<>();

        //添加
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        //访问
        System.out.println(linkedList.get(1));

        //插入
        linkedList.set(1,"pear");
        System.out.println(linkedList);

        //删除
        linkedList.remove(2);
        System.out.println(linkedList);

        //替换
        linkedList.set(1,"peach");
        System.out.println(linkedList);

        //是否为空
        System.out.println(linkedList.isEmpty());

        //清空
        linkedList.clear();
        System.out.println(linkedList);

        // 使用 addFirst 和 addLast 方法
        linkedList.addFirst("Dog");
        linkedList.addLast("Cat");
        System.out.println(linkedList); // 输出: [Dog, Cat]

        // 获取第一个和最后一个元素
        System.out.println(linkedList.getFirst()); // 输出: Dog
        System.out.println(linkedList.getLast()); // 输出: Cat

        // 移除第一个和最后一个元素
        linkedList.removeFirst(); // 移除"Dog"
        System.out.println(linkedList); // 输出: [Cat]

        linkedList.removeLast(); // 移除"Cat"
        System.out.println(linkedList.isEmpty()); // 输出: true
    }
}
