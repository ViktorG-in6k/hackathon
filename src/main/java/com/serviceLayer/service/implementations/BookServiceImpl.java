package com.serviceLayer.service.implementations;

import com.dataLayer.DAO.interfaces.BookDAO;
import com.dataLayer.DAO.interfaces.UserDAO;
import com.dataLayer.entity.Book;
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

    @Override
    public List<BooksResponceDTO> getAllBook(){
        List<BooksResponceDTO> booksResponceDTOs = new ArrayList<>();
        for (Book book:  bookDAO.getListOfAllBooks()){
            booksResponceDTOs.add(new BooksResponceDTO(book));
        }
        return booksResponceDTOs;
    }
}
