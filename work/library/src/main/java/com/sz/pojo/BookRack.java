package com.sz.pojo;

public class BookRack {
    private int bookrack_id;
    private int bookrack_floor;
    private String bookrack_location;

    public int getBookrack_id() {
        return bookrack_id;
    }

    public void setBookrack_id(int bookrack_id) {
        this.bookrack_id = bookrack_id;
    }

    public int getBookrack_floor() {
        return bookrack_floor;
    }

    public void setBookrack_floor(int bookrack_floor) {
        this.bookrack_floor = bookrack_floor;
    }

    public String getBookrack_location() {
        return bookrack_location;
    }

    public void setBookrack_location(String bookrack_location) {
        this.bookrack_location = bookrack_location;
    }

    public BookRack() {
    }

    public BookRack(int bookrack_id, int bookrack_floor, String bookrack_location) {
        this.bookrack_id = bookrack_id;
        this.bookrack_floor = bookrack_floor;
        this.bookrack_location = bookrack_location;
    }

    @Override
    public String toString() {
        return "BookRack{" +
                "bookrack_id=" + bookrack_id +
                ", bookrack_floor=" + bookrack_floor +
                ", bookrack_location='" + bookrack_location + '\'' +
                '}';
    }
}
