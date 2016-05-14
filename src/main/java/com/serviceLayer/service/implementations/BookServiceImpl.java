package com.serviceLayer.service.implementations;

import com.dataLayer.DAO.interfaces.BookDAO;
import com.dataLayer.DAO.interfaces.UserDAO;
import com.dataLayer.entity.Book;
import com.dataLayer.entity.DTO.BookDTO;
import com.dataLayer.entity.DTO.BooksResponceDTO;
import com.serviceLayer.service.interfaces.BookService;
import com.serviceLayer.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDAO bookDAO;

    public void saveBook(Book book)
    {
        bookDAO.save(book);
    }

    @Override
    public List<BooksResponceDTO> getAllBook(){
        List<BooksResponceDTO> booksResponceDTOs = new ArrayList<>();
        for (Book book:  bookDAO.getListOfAllBooks()){
            booksResponceDTOs.add(new BooksResponceDTO(book));
        }
        return booksResponceDTOs;
    }

    @Override
    public BookDTO getBookById(int id){
        return new BookDTO(bookDAO.getBookById(id));
    }
}
