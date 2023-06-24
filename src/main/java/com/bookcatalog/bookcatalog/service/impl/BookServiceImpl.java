package com.bookcatalog.bookcatalog.service.impl;

import com.bookcatalog.bookcatalog.dto.BooksDto;
import com.bookcatalog.bookcatalog.entity.Books;
import com.bookcatalog.bookcatalog.repo.BooksRepo;
import com.bookcatalog.bookcatalog.service.BooksService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BookServiceImpl implements BooksService {

    @Autowired
    BooksRepo booksRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String saveBook(BooksDto dto) {
        Books books = booksRepo.findByBookName(dto.getBookName());
        if (Objects.equals(books, null)){
            booksRepo.save(modelMapper.map(dto, Books.class));
            return "success";
        }
        throw new RuntimeException("Book Name Already Exist!");
    }

    @Override
    public String updateBook(BooksDto dto) {
        Books books = booksRepo.findById(dto.getBookId());
        if (!Objects.equals(books,null)){
            booksRepo.save(modelMapper.map(dto, Books.class));
            return "success";
        }
        throw new RuntimeException("Book Name Already Exist!");
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
