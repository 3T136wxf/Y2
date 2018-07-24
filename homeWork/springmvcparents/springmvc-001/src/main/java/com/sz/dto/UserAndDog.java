package com.sz.dto;

import com.sz.pojo.Dog;
import com.sz.pojo.User;

public class UserAndDog {
    private User user;
    private Dog dog;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public UserAndDog() {
    }

    public UserAndDog(User user, Dog dog) {
        this.user = user;
        this.dog = dog;
    }
}
