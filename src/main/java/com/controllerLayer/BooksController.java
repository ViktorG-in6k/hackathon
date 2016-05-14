package com.controllerLayer;

import com.dataLayer.entity.DTO.BooksResponceDTO;
import com.dataLayer.entity.User;
import com.serviceLayer.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

}
