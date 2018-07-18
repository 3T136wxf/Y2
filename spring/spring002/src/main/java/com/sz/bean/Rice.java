package com.sz.bean;

public class Rice {
    private String name;

    public Rice() {
        System.out.println("做饭中。。。。。。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rice{" +
                "name='" + name + '\'' +
                '}';
    }
}
