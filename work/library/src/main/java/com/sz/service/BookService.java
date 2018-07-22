package com.sz.service;

import com.sz.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    int addBook(@Param("book") Book book);

    int delBook(@Param("book_id") int book_id);

    List<Book> selBook();

    int updBook(@Param("book") Book book);

}
