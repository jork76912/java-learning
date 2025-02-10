package com.java_learning.Javacode02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtil {
    /**
     * 读取文件内容。
     *
     * @param path 文件路径
     * @return 文件内容
     * @throws IOException 如果读取文件失败
     */
    public static String readFile(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }

    /**
     * 写入文件内容。
     *
     * @param path 文件路径
     * @param content 写入的内容
     * @throws IOException 如果写入文件失败
     */
    public static void writeFile(String path, String content) throws IOException {
        Files.write(Paths.get(path), content.getBytes());
    }
}
