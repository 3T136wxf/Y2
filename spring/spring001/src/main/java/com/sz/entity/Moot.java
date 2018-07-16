package com.sz.entity;

public class Moot {

    private Integer num;
    private String name;
    private String color;

    public Moot() {
    }

    public Moot(Integer num, String name) {
        this.num = num;
        this.name = name;
    }

    public Moot(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Moot(Integer num, String name, String color) {
        this.num = num;
        this.name = name;
        this.color = color;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Moot{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
