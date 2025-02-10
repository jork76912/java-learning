package com.java_learning.Javacode02;

public class TestStudentManager {
    public static  void main(String[] args){
        Student student_1 = new Student(1,"张三");
        Student student_2 = new Student(2,"李四");
        Student student_3 = new Student(3,"黄麻子");
        StudentManager studentManager = new StudentManager();
        try {
            studentManager.addStudent(student_1);
            studentManager.addStudent(student_2);
            studentManager.addStudent(student_3);
           System.out.println(studentManager.findStudent(2).getName());

            studentManager.findStudent(4);
        } catch (DuplicateIdException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
