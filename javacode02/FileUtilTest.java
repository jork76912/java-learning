package com.java_learning.Javacode02;

import java.io.IOException;

public class FileUtilTest {
    public static void main(String[] args) {
        // 定义文件路径和内容
        String testFilePath = "C:\\Users\\86183\\Desktop\\test.txt";
        String testContent = "Hello, World!";

        try {
            // 测试写入文件
            System.out.println("Writing to file...");
            FileUtil.writeFile(testFilePath, testContent);
            System.out.println("Write operation completed. Check if the file exists and contains correct content.");

            // 测试读取文件
            System.out.println("Reading from file...");
            String contentRead = FileUtil.readFile(testFilePath);
            System.out.println("File content: " + contentRead);

            // 验证读取的内容是否与写入的一致
            if (contentRead.equals(testContent)) {
                System.out.println("The read content matches the written content.");
            } else {
                System.out.println("There was an error in reading or writing the file.");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
