package com.dataLayer.DAO.implementations;

import com.dataLayer.DAO.interfaces.BookDAO;
import com.dataLayer.DAO.interfaces.UserDAO;
import com.dataLayer.entity.Book;
import com.dataLayer.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public List<Book> getListOfAllBooks() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from book");
        return (List<Book>) query.list();
    }

    @Override
    public Book getBookById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from book where id =:id");
        return (Book) query.setInteger("id", id).uniqueResult();
    }


    @Override
    public void setOwner(int bookId, int ownerId) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("update book set owner_id = :ownerId where id = :bookId");
        query
                .setInteger("bookId",bookId)
                .setInteger("ownerId",ownerId);
        query.executeUpdate();
    }

    @Override
    public void setOwner(int bookId) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("update book set owner_id = :id where id = :bookId");
        query
                .setString("id",null)
                .setInteger("bookId",bookId);
        query.executeUpdate();
    }
}
