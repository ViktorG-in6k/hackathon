package com.serviceLayer.service.interfaces;

import com.dataLayer.entity.Book;
import com.dataLayer.entity.DTO.BookDTO;
import com.dataLayer.entity.DTO.BooksResponceDTO;

import java.util.List;

public interface BookService {

    void saveBook(Book book);

    List<BooksResponceDTO> getAllBook();

    BookDTO getBookById(int id);
}
