package com.java_learning.Javacode01;

public class main_02 {
    public static void main(String[] args){
        Book book = new Book("红楼梦","曹雪芹",99.90);
        book.displayInfo();
        book.setPrice(120);
        System.out.println("新价格：" + book.getPrice());
        try{
        book.setPrice(-10);
        System.out.println("更新价格： " + book.getPrice());
        }catch (IllegalArgumentException e) {
            System.err.println("Caught an exception: " + e.getMessage());//err与out独立的流
        }
    }
}
