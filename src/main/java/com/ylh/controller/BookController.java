package com.ylh.controller;

import com.ylh.pojo.Book;
import com.ylh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result add(@RequestBody Book book) {
        Boolean flag = bookService.add(book);
        return new Result(flag ? Code.ADD_OK : Code.ADD_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        Boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        Boolean flag = bookService.deleteById(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        return new Result(code, book);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERR;
        String message = bookList != null ? "success" : "failure";
        return new Result(code, bookList, message);
    }

    @PostMapping(value = "/get")
    public Result getByCondition(@RequestBody Book book) {
        List<Book> bookList = bookService.getByCondition(book);
        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERR;
        return new Result(code, bookList);
    }




}
