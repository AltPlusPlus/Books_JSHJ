package com.atlPlusPlus.controller;

import java.awt.print.Book;
import java.util.List;

import com.atlPlusPlus.model.Books;
import com.atlPlusPlus.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping("/users/{username}/books")
    private List<Books> getAllBooks(@PathVariable String username) {
        return booksService.getAllBooksService();
    }

    @GetMapping("/users/{username}/book/{bookid}")
    private Books getBookByID(@PathVariable String username, @PathVariable int bookid) {
        return booksService.findBookByID(bookid);
    }


    @DeleteMapping("/users/{username}/book/{bookid}")
    private ResponseEntity<Void> deleteBook(@PathVariable String username, @PathVariable int bookid){
        Books deletedBook = booksService.deleteById(bookid);
        if (deletedBook != null){
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
}

