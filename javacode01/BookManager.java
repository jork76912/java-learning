package com.java_learning.Javacode01;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books = new ArrayList<>();

    // 添加一本书到集合中
    void addBook(Book book) {
        if(book != null) {
            books.add(book);
            System.out.println("书籍添加成功！");
        }
        else{
            System.out.println("无法添加空的书籍对象");
        }
    }
    // 显示所有书籍的信息
    void showAllBooks() {
        if(books.isEmpty()){
            System.out.println("没有书籍记录" );
        }
        else{
            for(Book book :books )
            {
                book.displayInfo();
                System.out.println("--------------");
            }
        }
    }

    // 根据书名查找书籍
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // 如果没有找到匹配的书籍，则返回null
    }

    // 删除一本根据书名指定的书籍
    public boolean removeBookByTitle(String title) {
        Book bookToRemove = findBookByTitle(title);
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("书籍已成功移除: " + title);
            return true;
        } else {
            System.out.println("未找到书名为 " + title + " 的书籍");
            return false;
        }
    }

    // 更新一本书的价格
    public boolean updateBookPrice(String title, double newPrice) {
        Book bookToUpdate = findBookByTitle(title);
        if (bookToUpdate != null) {
            try {
                bookToUpdate.setPrice(newPrice); // 调用Book类中的setPrice方法，可能抛出异常
                System.out.println("书籍 " + title + " 的价格已更新为 " + newPrice);
                return true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // 输出异常信息
                return false;
            }
        } else {
            System.out.println("未找到书名为 " + title + " 的书籍");
            return false;
        }
    }
}
