package com.serviceLayer.service.interfaces;

import com.dataLayer.entity.Book;
import com.dataLayer.entity.DTO.BookDTO;
import com.dataLayer.entity.DTO.BooksResponceDTO;
import com.dataLayer.entity.DTO.RequestBook;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface BookService {

    void saveBook(RequestBook book, Authentication authentication);

    List<BooksResponceDTO> getAllBook();

    BookDTO getBookDTOById(int id);

    Book getBookById(int id);

    void setOwner(int bookId, Authentication authentication);

    void remoteOwner(int bookId);
}
