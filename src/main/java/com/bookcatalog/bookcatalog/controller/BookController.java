package com.bookcatalog.bookcatalog.controller;

import com.bookcatalog.bookcatalog.dto.BooksDto;
import com.bookcatalog.bookcatalog.service.BooksService;
import com.bookcatalog.bookcatalog.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
                new StandardResponse(200,s,null),
                HttpStatus.OK
        );
    }

    @PutMapping
    public ResponseEntity<StandardResponse> updateBook(@RequestBody BooksDto dto){
        String s = booksService.saveBook(dto);
        return new ResponseEntity<>(
                new StandardResponse(200,s,null),
                HttpStatus.OK
        );
    }

    @DeleteMapping(params = "bookId")
    public ResponseEntity<StandardResponse> deleteBook(@RequestParam int bookId){
        String s = booksService.deleteBook(bookId);
        return new ResponseEntity<>(
                new StandardResponse(200,s,null),
                HttpStatus.OK
        );
    }

    @GetMapping(params = "bookId")
    public ResponseEntity<StandardResponse> getBook(@RequestParam int bookId){
        BooksDto booksDto = booksService.searchBook(bookId);
        return new ResponseEntity<>(
                new StandardResponse(200,"success",booksDto),
                HttpStatus.OK
        );
    }

    @GetMapping(path = "/all",params = {"bookName", "category"})
    public ResponseEntity<StandardResponse> getAllBook(@RequestParam String bookName,
                                                       @RequestParam String category){
        List<BooksDto> allBook = booksService.getAllBook(bookName, category);
        return new ResponseEntity<>(
                new StandardResponse(200,"success",allBook),
                HttpStatus.OK
        );
    }
}
