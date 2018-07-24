package com.sz.pojo;

public class User {

    private Integer uid;
    private Integer age;
    private String userName;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public User(Integer uid, Integer age, String userName) {
        this.uid = uid;
        this.age = age;
        this.userName = userName;
    }
}
