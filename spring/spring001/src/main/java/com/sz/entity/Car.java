package com.sz.entity;

public class Car {
    private Integer num;
    private String name;
    private String color;

    private Moot moot;

    public Moot getMoot() {
        return moot;
    }

    public void setMoot(Moot moot) {
        this.moot = moot;
    }

    public Car() {
    }

    public Car(Integer num, String name) {
        this.num = num;
        this.name = name;
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public Car(Integer num, String name, String color,Moot moot) {
        this.num = num;
        this.name = name;
        this.color = color;
        this.moot=moot;
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
        return "Car{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", moot=" + moot +
                '}';
    }
}
