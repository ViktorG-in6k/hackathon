package com.serviceLayer.service.implementations;

import com.dataLayer.DAO.interfaces.TransferDAO;
import com.dataLayer.entity.Book;
import com.dataLayer.entity.Transfer;
import com.dataLayer.entity.User;
import com.serviceLayer.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class TransferServiceImpl {
    @Autowired
    TransferDAO transferDAO;
    @Autowired
    BookService bookService;

    public void createTransfer(int bookId, Authentication authentication) {
        User creator = ((User) authentication.getPrincipal());
        Book book = bookService.getBookById(bookId);
        Transfer transfer = new Transfer(book,creator);
        transferDAO.save(transfer);
    }

}
