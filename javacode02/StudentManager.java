package com.java_learning.Javacode02;

import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private Map<Integer,Student> students = new HashMap<>();
    // 添加学生（学号唯一）
    void addStudent(Student stu) throws DuplicateIdException {
        if (students.containsKey(stu.getId())) {
            throw new DuplicateIdException("学号重复: " + stu.getId());
        }
        students.put(stu.getId(), stu);
    }

    // 按学号查询（处理未找到情况）
    Student findStudent(int id) throws StudentNotFoundException {
        Student stu = students.get(id);
        if (stu == null) {
            throw new StudentNotFoundException("学号不存在: " + id);
        }
        return stu;
    }
}

class DuplicateIdException extends Exception{
    public DuplicateIdException(String message){
        super(message);
    }
}

class StudentNotFoundException extends  Exception{
    public StudentNotFoundException(String message){
        super(message);
    }
}
