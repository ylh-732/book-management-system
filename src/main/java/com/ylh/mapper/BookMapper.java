package com.ylh.mapper;

import com.ylh.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    int add(Book book);
    int update(Book book);
    int deleteById(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    List<Book> getByCondition(Book book);

}
