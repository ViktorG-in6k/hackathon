package com.controllerLayer;

import com.dataLayer.entity.Book;
import com.dataLayer.entity.DTO.BookDTO;
import com.dataLayer.entity.DTO.BooksResponceDTO;
import com.dataLayer.entity.User;
import com.serviceLayer.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import retrofit.http.GET;

import java.util.List;

@Controller
public class BooksController {
    @Autowired
    BookService bookService;

    @RequestMapping(value = "/api/books", method = RequestMethod.GET)
    public
    @ResponseBody
    List<BooksResponceDTO> getBooks() {
        return bookService.getAllBook();
    }

    @RequestMapping(value = "/api/books", method = RequestMethod.POST)
    public
    @ResponseBody
    void saveBook(@RequestBody Book book) { bookService.saveBook(book); }

    @RequestMapping(value = "/api/books/{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    BookDTO getBook(@PathVariable("id") int bookId) {
        return bookService.getBookById(bookId);
    }
}

