package com.bookcatalog.bookcatalog.service.impl;

import com.bookcatalog.bookcatalog.dto.BooksDto;
import com.bookcatalog.bookcatalog.entity.Books;
import com.bookcatalog.bookcatalog.repo.BooksRepo;
import com.bookcatalog.bookcatalog.service.BooksService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
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
        throw new RuntimeException("Book not Exist!");
    }

    @Override
    public String deleteBook(int bookId) {
        Books books = booksRepo.findById(bookId);
        if (!Objects.equals(books,null)){
            booksRepo.delete(books);
            return "success";
        }
        throw new RuntimeException("Book not Exist!");
    }

    @Override
    public BooksDto searchBook(int bookId) {
        Books books = booksRepo.findById(bookId);
        if (!Objects.equals(books,null)){
            return modelMapper.map(books, BooksDto.class);
        }
        throw new RuntimeException("Book not Exist!");
    }

    @Override
    public List<BooksDto> getAllBook(String bookName, String category) {
        return null;
    }
}
