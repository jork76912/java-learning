package com.java_learning.Javacode03;

import java.util.Optional;

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Main01 {
    public static void main(String[] args) {
        // 创建一个可能没有名字的用户
        User userWithNoName = new User(null);
        User userWithName = new User("Alice");

        // 使用 Optional 处理用户的名字
        printUserName(userWithNoName); // 应输出 "UNKNOWN"
        printUserName(userWithName);   // 应输出 "ALICE"
    }

    private static void printUserName(User user) {
        Optional<String> name = Optional.ofNullable(user.getName());
        String upper = name.map(String::toUpperCase).orElseGet(() -> "UNKNOWN");
        System.out.println(upper);
    }
}
