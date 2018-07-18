package com.sz.bean;

public class Book {

    private Double price;
    private String name;

    public Book() {
        System.out.println("本书无参");
    }

    public void destory(){
        System.out.println("死了我一本书，还有千千万万本书");
    }

    public void init(){
        System.out.println("初始化是Booke类");
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
