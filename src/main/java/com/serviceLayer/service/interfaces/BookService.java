package com.serviceLayer.service.interfaces;

import com.dataLayer.entity.DTO.BookDTO;
import com.dataLayer.entity.DTO.BooksResponceDTO;

import java.util.List;

public interface BookService {
    List<BooksResponceDTO> getAllBook();

    BookDTO getBookById(int id);
}
