package com.dataLayer.DAO.interfaces;

import com.dataLayer.entity.Book;

import java.util.List;

public interface BookDAO {
    void save(Book book);

    List<Book> getListOfAllBooks();

    Book getBookById(int id);
}
