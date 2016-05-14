package com.serviceLayer.service.implementations;

import com.dataLayer.DAO.interfaces.BookDAO;
import com.dataLayer.DAO.interfaces.UserDAO;
import com.serviceLayer.service.interfaces.BookService;
import com.serviceLayer.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDAO bookDAO;


}
