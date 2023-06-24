package com.bookcatalog.bookcatalog.service;

import com.bookcatalog.bookcatalog.dto.BooksDto;

import java.util.List;

public interface BooksService {

    String saveBook(BooksDto dto);
    String updateBook(BooksDto dto);
    String deleteBook(int bookId);
    BooksDto  searchBook(int bookId);
    List<BooksDto> getAllBook(String value);
}
