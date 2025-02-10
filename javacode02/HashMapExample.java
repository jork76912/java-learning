package com.java_learning.Javacode02;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args){
        HashMap<String , Integer > hashMap = new HashMap<>();

        hashMap.put("apple",0);
        hashMap.put("pear",1);
        hashMap.put("banana",2);
        System.out.println(hashMap);

        System.out.println(hashMap.get("apple"));

        System.out.println(hashMap.containsKey("banana"));

        System.out.println(hashMap.containsValue(3));

        System.out.println(hashMap.keySet());

        System.out.println(hashMap.values());

        //Map.Entry<K, V>是Map接口中的一个嵌套接口
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 使用 Map.Entry 修改值
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if ("banana".equals(entry.getKey())) {
                entry.setValue(5); // 将 "Banana" 的值修改为 5
            }
        }
        hashMap.remove("apple");
        System.out.println(hashMap);
    }
}
