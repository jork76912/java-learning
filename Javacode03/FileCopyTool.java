package com.java_learning.Javacode03;

import java.io.*;


public class FileCopyTool {

    public static void copyFile(String src, String dest) throws IOException {
        try (InputStream is = new FileInputStream(src);
             OutputStream os = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }
    }

    public static void main(String[] args){
        String sourceFilePath = "C:\\Users\\86183\\Desktop\\input.txt";
        String destinationFilePath = "C:\\Users\\86183\\Desktop\\output.txt";
        try {
            copyFile(sourceFilePath, destinationFilePath);
            System.out.println("文件复制成功！");
        } catch (IOException e) {
            System.out.println("文件复制失败：" + e.getMessage());
        }
    }
}
