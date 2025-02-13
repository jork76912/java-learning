package com.java_learning.Javacode03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class WordCounter {
    public static void main(String[] args) {
        try (Stream<String> lines = Files.lines(Paths.get("C:/Users/86183/Desktop/sample.txt"))) { // 使用正确的路径格式
            long wordCount = lines
                   // .parallel()   //并发处理
                    .flatMap(line -> Arrays.stream(line.split("\\W+"))) // 正确的正则表达式用于分割单词
                    .filter(Objects::nonNull) // 过滤空字符串
                    .distinct() // 去除重复单词
                    .peek(System.out::println) // 输出单词，用于调试
                    .count(); // 计数

            System.out.println("Total unique words: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}