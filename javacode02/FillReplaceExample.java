package com.java_learning.Javacode02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FillReplaceExample {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        // 填充:全部替换
        Collections.fill(words, "fruit");
        System.out.println("Filled List: " + words); // 输出: Filled List: [fruit, fruit, fruit]

        // 替换：选择替换
        Collections.replaceAll(words, "fruit", "vegetable");
        System.out.println("Replaced List: " + words); // 输出: Replaced List: [vegetable, vegetable, vegetable]
    }
}
