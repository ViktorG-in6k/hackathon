package com.dataLayer.DAO.implementations;

import com.dataLayer.DAO.interfaces.TransferDAO;
import com.dataLayer.entity.Book;
import com.dataLayer.entity.Transfer;
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
public class TransferDAOImpl implements TransferDAO {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(Transfer transfer) {
        Session session = sessionFactory.getCurrentSession();
        session.save(transfer);
    }

    @Override
    public List<Book> getListOfBookByUser(int userId) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from transfer where user_id = :userId");
        return (List<Book>) query.setLong("userId", userId).list();
    }

}
