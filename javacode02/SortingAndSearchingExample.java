package com.java_learning.Javacode02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingAndSearchingExample {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5,2,9,1));
        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println(numbers);

        System.out.println(Collections.binarySearch(numbers,5));

        Collections.reverse(numbers);
        System.out.println(numbers);

        //随机打乱
        Collections.shuffle(numbers);
        System.out.println(numbers);
    }
}
