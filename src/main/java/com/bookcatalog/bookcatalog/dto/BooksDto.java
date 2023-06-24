package com.bookcatalog.bookcatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BooksDto {
    private int bookId;
    private String  bookName;
    private String  description;
    private String  author;
    private double price;
}
