package com.java_learning.Javacode02;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args){
        Vector<String> vector = new Vector<>();

        //插入
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // 访问元素
        System.out.println(vector.get(0)); // 输出: Apple

        // 插入元素
        vector.add(1, "Orange"); // 在索引1处插入"Orange"
        System.out.println(vector); // 输出: [Apple, Orange, Banana, Cherry]

        // 删除元素
        vector.remove(2); // 删除索引2处的元素"Banana"
        System.out.println(vector); // 输出: [Apple, Orange, Cherry]

        // 替换元素
        vector.set(1, "Grape"); // 将索引1处的元素"Orange"替换为"Grape"
        System.out.println(vector); // 输出: [Apple, Grape, Cherry]

        // 获取列表大小
        System.out.println(vector.size()); // 输出: 3

        // 检查列表是否为空
        System.out.println(vector.isEmpty()); // 输出: false

        // 清空列表
        vector.clear();
        System.out.println(vector.isEmpty()); // 输出: true


        // 使用 addElement 和 firstElement 方法
        vector.addElement("Dog");
        vector.addElement("Cat");
        System.out.println(vector); // 输出: [Dog, Cat]

        // 获取第一个和最后一个元素
        System.out.println(vector.firstElement()); // 输出: Dog
        System.out.println(vector.lastElement()); // 输出: Cat

        //移除
        vector.removeElement("Dog"); // 移除"Dog"
        vector.removeElement("Cat"); // 移除"Cat"
        System.out.println(vector.isEmpty()); // 输出: true

    }
}
