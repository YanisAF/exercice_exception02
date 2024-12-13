package com.example.exercice_exception02.model;

import java.time.LocalDate;

public class Book {
    private int id;
    private String title;
    private String author;
    private int pages;
    private boolean isEmpty;
    private LocalDate releaseDate;

    public Book(int id, String title, String author, int pages, boolean isEmpty, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isEmpty = isEmpty;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean getIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Titre: "+title+
                ", Author: "+author+
                ", Pages: "+pages+
                ", Disponible: "+isEmpty+
                ", Date: "+releaseDate;
    }
}
