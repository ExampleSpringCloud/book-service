package com.marcuschiu.bookservice;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @AllArgsConstructor - allows new Book(1L, "Baeldung goes to the market", "Tim Schimandle")
 */
@Data
@AllArgsConstructor
public class Book {
    Long id;
    String author;
    String title;
}