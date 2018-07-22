package com.sz.pojo;

import java.util.Date;

public class BookCar {

    private int car_id;
    private int car_bookId;
    private int car_userId;
    private Date car_day;

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public int getCar_bookId() {
        return car_bookId;
    }

    public void setCar_bookId(int car_bookId) {
        this.car_bookId = car_bookId;
    }

    public int getCar_userId() {
        return car_userId;
    }

    public void setCar_userId(int car_userId) {
        this.car_userId = car_userId;
    }

    public Date getCar_day() {
        return car_day;
    }

    public void setCar_day(Date car_day) {
        this.car_day = car_day;
    }

    public BookCar(int car_id, int car_bookId, int car_userId, Date car_day) {
        this.car_id = car_id;
        this.car_bookId = car_bookId;
        this.car_userId = car_userId;
        this.car_day = car_day;
    }

    public BookCar() {
    }

    @Override
    public String toString() {
        return "BookCar{" +
                "car_id=" + car_id +
                ", car_bookId=" + car_bookId +
                ", car_userId=" + car_userId +
                ", car_day=" + car_day +
                '}';
    }
}
