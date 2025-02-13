package com.java_learning.Javacode03;

import java.io.File;

public class FolderTraversal {
    public static void listFiles(File dir) {
        if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                if (file.isDirectory()) {
                    listFiles(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }

    public static void main(String[] args) {
        // 指定要遍历的文件夹路径
        File directory = new File("E:\\WpSystem");
        listFiles(directory);
    }
}
