package com.java_learning.Javacode02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListExample {
    List<String> mutableList = new ArrayList<>(Arrays.asList("A", "B", "C"));
    List<String> unmodifiableList = Collections.unmodifiableList(mutableList);

    //unmodifiableList数组不可变，但依赖于底层可变列表，如果底层列表被修改，不可变视图也会受影响。
//    Arrays.asList只能修改
//   不可变 List<String> immutableList = List.of("A", "B", "C"); Java 9特性

}
