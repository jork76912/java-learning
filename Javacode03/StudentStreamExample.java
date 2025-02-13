package com.java_learning.Javacode03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

// 定义 Student 类
class Student {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", score=" + score + "}";
    }
}

public class StudentStreamExample {
    public static void main(String[] args) {
        // 创建学生集合
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, 85.0));
        students.add(new Student("Bob", 17, 70.0));
        students.add(new Student("Charlie", 22, 90.0));
        students.add(new Student("David", 16, 65.0));
        students.add(new Student("Eve", 19, 80.0));

        // 找出年龄大于 18 岁的学生
        List<Student> studentsOver18 = students.stream()
                .filter(student -> student.getAge() > 18)
                .collect(Collectors.toList());
        System.out.println("年龄大于 18 岁的学生：");
        studentsOver18.forEach(System.out::println);

        // 按成绩降序排序
        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparingDouble(Student::getScore).reversed())
                .collect(Collectors.toList());
        System.out.println("\n按成绩降序排序后的学生：");
        sortedStudents.forEach(System.out::println);

        // 计算平均成绩
        OptionalDouble averageScore = students.stream()
                .mapToDouble(Student::getScore)
                .average();
        if (averageScore.isPresent()) {
            System.out.println("\n学生的平均成绩：" + averageScore.getAsDouble());
        } else {
            System.out.println("\n没有学生数据，无法计算平均成绩。");
        }
    }
}