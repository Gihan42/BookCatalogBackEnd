package com.bookcatalog.bookcatalog.service.impl;

import com.bookcatalog.bookcatalog.dto.BooksDto;
import com.bookcatalog.bookcatalog.service.BooksService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BooksService {
    @Override
    public String saveBook(BooksDto dto) {
        return null;
    }

    @Override
    public String updateBook(BooksDto dto) {
        return null;
    }

    @Override
    public String deleteBook(int bookId) {
        return null;
    }

    @Override
    public BooksDto searchBook(int bookId) {
        return null;
    }

    @Override
    public List<BooksDto> getAllBook(String value) {
        return null;
    }
}
