package com.ylh.service;

import com.ylh.pojo.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    boolean add(Book book);
    boolean update(Book book);
    boolean deleteById(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    List<Book> getByCondition(Book book);
}
