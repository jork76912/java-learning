package com.java_learning.Javacode02;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaxMinExample {
    public static void main(String[] args){
        Collection<Integer> numbers = Arrays.asList(5, 2, 9, 1);
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
    }
}
