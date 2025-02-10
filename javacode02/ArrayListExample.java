package com.java_learning.Javacode02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");
        arrayList.add("lemon");
        arrayList.add("haw");
        arrayList.add("peach");
        arrayList.add("pear");
        //插入
        arrayList.add(1, "Orange");
        System.out.println(arrayList);
        //替换
        arrayList.set(5,"Orange");
        System.out.println(arrayList);
        //列表大小
        System.out.println(arrayList.size());
        //获取
        System.out.println(arrayList.get(2));
        //删除
        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.remove("apple");
        System.out.println(arrayList);

        //是否为空
        System.out.println(arrayList.isEmpty());
        //清空
        arrayList.clear();
        System.out.println(arrayList);

//        for(String s : arrayList){
//            System.out.println(s);
//        }
    }
}
