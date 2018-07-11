package com.sz.mapper;

import com.sz.entity.Author;
import com.sz.entity.Book;

import java.util.List;

public interface BookMapper {

    //    1 to N
    Author selectTive(Integer id);

    //    N TO 1
    List<Book> selectTive2(Integer id);

    // 1 to n 删除
    int deleteAll(Integer id);

    List<Book> selectById();

    List<Book> selectList(List<Integer> bookList);

    void inserTive(Book books);

    int updateTive(Book books);

    int deleteTive(Integer id);

}
