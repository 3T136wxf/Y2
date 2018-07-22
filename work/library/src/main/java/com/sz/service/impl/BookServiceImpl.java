package com.sz.service.impl;

import com.sz.mapper.BookMapper;
import com.sz.pojo.Book;
import com.sz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int delBook(int book_id) {
        return bookMapper.delBook(book_id);
    }

    @Override
    public List<Book> selBook() {
        return bookMapper.selBook();
    }

    @Override
    public int updBook(Book book) {
        return bookMapper.updBook(book);
    }

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
}
