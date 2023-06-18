package com.ylh.service.impl;

import com.ylh.mapper.BookMapper;
import com.ylh.pojo.Book;
import com.ylh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean add(Book book) {
        return bookMapper.add(book) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookMapper.update(book) > 0;
    }

    @Override
    public boolean deleteById(Integer id) {
        return bookMapper.deleteById(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        return bookMapper.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.getAll();
    }

    @Override
    public List<Book> getByCondition(Book book) {
        String name = book.getName();
        if (name != null && name.length() > 0) {
            book.setName("%" + name + "%");
        }

        String author = book.getAuthor();
        if (author != null && author.length() > 0) {
            book.setAuthor("%" + author + "%");
        }

        return bookMapper.getByCondition(book);
    }
}
