package com.sz.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Girl {
    private String[] fridens;
    private List<Integer> nos;
    private Set<Book> books;
    private Map<String,Rice> likeRices;

    public Map<String, Rice> getLikeRices() {
        return likeRices;
    }

    public void setLikeRices(Map<String, Rice> likeRices) {
        this.likeRices = likeRices;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public String[] getFridens() {
        return fridens;
    }

    public void setFridens(String[] fridens) {
        this.fridens = fridens;
    }

    public List<Integer> getNos() {
        return nos;
    }

    public void setNos(List<Integer> nos) {
        this.nos = nos;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "fridens=" + Arrays.toString(fridens) +
                ", nos=" + nos +
                ", books=" + books +
                ", likeRices=" + likeRices +
                '}';
    }
}
