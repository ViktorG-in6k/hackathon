package com.dataLayer.DAO.implementations;

import com.dataLayer.DAO.interfaces.BookDAO;
import com.dataLayer.DAO.interfaces.UserDAO;
import com.dataLayer.entity.Book;
import com.dataLayer.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unchecked")
@Repository
@Transactional
public class BookDAOImpl implements BookDAO {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.save(book);
    }
}
