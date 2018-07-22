package com.sz.pojo;

public class Book {
    private int book_id;
    private String book_name;
    private int book_price;
    private int book_type;//分类 1：历史 2：神话 3：儿童 4：人文 5：宇宙
    private int book_restrict;//种类 1：典藏  2：不可外界  3：英文 4：公开

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getBook_price() {
        return book_price;
    }

    public void setBook_price(int book_price) {
        this.book_price = book_price;
    }

    public int getBook_type() {
        return book_type;
    }

    public void setBook_type(int book_type) {
        this.book_type = book_type;
    }

    public int getBook_restrict() {
        return book_restrict;
    }

    public void setBook_restrict(int book_restrict) {
        this.book_restrict = book_restrict;
    }

    public Book() {
    }

    public Book(int book_id, String book_name, int book_price, int book_type, int book_restrict) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_price = book_price;
        this.book_type = book_type;
        this.book_restrict = book_restrict;
    }

    public Book(String book_name, int book_price, int book_type, int book_restrict) {
        this.book_name = book_name;
        this.book_price = book_price;
        this.book_type = book_type;
        this.book_restrict = book_restrict;
    }



}
