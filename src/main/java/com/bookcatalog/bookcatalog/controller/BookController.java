package com.bookcatalog.bookcatalog.controller;

import com.bookcatalog.bookcatalog.dto.BooksDto;
import com.bookcatalog.bookcatalog.service.BooksService;
import com.bookcatalog.bookcatalog.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookController {

    @Autowired
    BooksService booksService;

    @PostMapping
    public ResponseEntity<StandardResponse> saveBook(@RequestBody BooksDto dto){
        String s = booksService.saveBook(dto);
        return new ResponseEntity<>(
                new StandardResponse(201,s,null),
                HttpStatus.CREATED
        );
    }
}
