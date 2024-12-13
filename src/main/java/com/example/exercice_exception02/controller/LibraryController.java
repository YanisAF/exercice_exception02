package com.example.exercice_exception02.controller;

import com.example.exercice_exception02.model.Book;
import com.example.exercice_exception02.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/book")
public class LibraryController {

    @Autowired
    private BookService bookService;

    public LibraryController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping()
    public void addBook() {
        bookService.addBook(new Book(1, "title", "auteur", 333, true, LocalDate.now()));
        System.out.println("Book added");

    }

    @GetMapping
    public List<Book> getAllBooks() {
        List<Book> book = new ArrayList<>();
        book = bookService.getListOfBooks();
        return book;
    }


}
