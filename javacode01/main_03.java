package com.java_learning.Javacode01;

public class main_03 {
    public static void main(String[] args)
    {
        BookManager manager = new BookManager();

        // 添加一些书籍
        manager.addBook(new Book("Effective Java", "Joshua Bloch", 39.99));
        manager.addBook(new Book("Clean Code", "Robert C. Martin", 49.99));

        // 显示所有书籍
        manager.showAllBooks();

        // 查找并打印特定标题的书籍信息
        Book foundBook = manager.findBookByTitle("Effective Java");
        if (foundBook != null) {
            foundBook.displayInfo();
        } else {
            System.out.println("未找到该书籍。");
        }

        // 尝试删除一本书籍
        boolean isRemoved = manager.removeBookByTitle("Clean Code");
        if (isRemoved) {
            System.out.println("书籍已被移除。");
        }

        // 再次显示所有书籍以确认删除操作
        manager.showAllBooks();
    }
}
