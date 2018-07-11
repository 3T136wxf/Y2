package com.sz.mapper;

import com.sz.entity.Book;

import java.util.List;

public interface BookMapper {

    List<Book> selectTive(Integer id);

    List<Book> selectTive2(Integer id);

    List<Book> selectById();

    List<Book> selectList(List<Integer> bookList);

    void inserTive(Book books);

    int updateTive(Book books);

    int deleteTive(Integer id);

}
