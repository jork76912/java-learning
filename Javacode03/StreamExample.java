package com.java_learning.Javacode03;

import java.util.*;
import java.util.stream.* ;


public class StreamExample {
    public static void main(String[] args){
//
//        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
//        List<String> lowerCaseFruits = fruits.stream()
//                .map(String::toLowerCase) //小写形式
//                .collect(Collectors.toList());
//        System.out.println(lowerCaseFruits);


//        List<List<String>> nestedFruits = Arrays.asList(
//                Arrays.asList("Apple", "Banana"),
//                Arrays.asList("Cherry", "Date")
//        );
//        List<String> flatFruitList = nestedFruits.stream()
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());
//        // 现在你可以多次遍历 flatFruitList
//        flatFruitList.forEach(System.out::println);



//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        IntStream numberStream = numbers.stream()
//                .mapToInt(Integer::intValue);
//        int sum =numberStream.sum();
//        System.out.println("Sum: " + sum);
        //流只能使用一次！！！
        //System.out.println("Sum: " + numberStream.sum());

//        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
//        String allFruits = fruits.stream()
//                //.collect(Collectors.joining(", "));// 结果：Apple, Banana, Cherry
//                .collect(Collectors.joining(", ","[","]"));// 输出：[Apple, Banana, Cherry]
//        System.out.println(allFruits);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// 过滤与映射
        List<String> filtered = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

// 聚合操作
        int totalLength = names.stream()
                .mapToInt(String::length)
                .sum();

        System.out.println(filtered);
        System.out.println(totalLength);
    }
}


