package com.wawa.helloworld;

public class Book {
    //书名(title)、作者(author)、价格(price)
    private String title;
    private String author;
    private double price;
    public Book(String title,String author,double prince){
        this.title = title;
        this.author = author;
        this.price = prince;
    }
    public String getTitle() {
        return title;
    }
    public  String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        if (price < 0) {
            throw new IllegalArgumentException("价格不能为负数");
        }
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("书名: " + title);
        System.out.println("作者: " + author);
        System.out.println("价格: " + price);
    }
}
