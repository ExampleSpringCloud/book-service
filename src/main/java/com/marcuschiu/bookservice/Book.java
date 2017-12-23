package com.marcuschiu.bookservice;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String author;
    private String title;

    public Book(long id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }
}