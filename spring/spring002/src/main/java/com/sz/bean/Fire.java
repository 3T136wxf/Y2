package com.sz.bean;

public class Fire {
    private String name;

    public Fire() {
        System.out.println("准备烧火");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fire{" +
                "name='" + name + '\'' +
                '}';
    }
}
