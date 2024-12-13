package com.example.exercice_exception02.service;

import com.example.exercice_exception02.annotation.ExceptionAnnotation;
import com.example.exercice_exception02.model.Book;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();
    private Book book;

    @ExceptionAnnotation
    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getListOfBooks() {
        return books;
    }

    public Book getBookById(int id) {
        this.book = books.get(id);
        return book;
    }

    public void deleteBookById(int id) {
        if (book.getId() != id) {
            System.out.printf("Id manquant, veuillez vérifier la list de livres.");
        }
        books.remove(id);
        books.remove(book);
        System.out.printf("Livre supprimé !!!"+books);
    }




}
