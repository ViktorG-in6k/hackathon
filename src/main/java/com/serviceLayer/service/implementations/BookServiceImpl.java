package com.serviceLayer.service.implementations;

import com.dataLayer.DAO.interfaces.BookDAO;
import com.dataLayer.DAO.interfaces.UserDAO;
import com.dataLayer.entity.Book;
import com.dataLayer.entity.DTO.BookDTO;
import com.dataLayer.entity.DTO.BooksResponceDTO;
import com.dataLayer.entity.DTO.RequestBook;
import com.dataLayer.entity.User;
import com.serviceLayer.service.interfaces.BookService;
import com.serviceLayer.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDAO bookDAO;

    @Override
    public void saveBook(RequestBook book, Authentication authentication) {
        User creator = ((User) authentication.getPrincipal());
        Book newBook = new Book(book, creator);
        bookDAO.save(newBook);
    }

    @Override
    public List<BooksResponceDTO> getAllBook() {
        List<BooksResponceDTO> booksResponceDTOs = new ArrayList<>();
        for (Book book : bookDAO.getListOfAllBooks()) {
            booksResponceDTOs.add(new BooksResponceDTO(book));
        }
        return booksResponceDTOs;
    }

    @Override
    public BookDTO getBookDTOById(int id) {
        return new BookDTO(bookDAO.getBookById(id));
    }

    @Override
    public Book getBookById(int id) {
        return bookDAO.getBookById(id);
    }

    @Override
    public void setOwner(int bookId, Authentication authentication) {
        User owner = ((User) authentication.getPrincipal());
        bookDAO.setOwner(bookId, owner.getId());
    }

    @Override
    public void remoteOwner(int bookId) {
        bookDAO.setOwner(bookId);
    }
}
