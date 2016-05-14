package com.dataLayer.DAO.interfaces;

import com.dataLayer.entity.Book;
import com.dataLayer.entity.Transfer;

import java.util.List;

public interface TransferDAO {
    void save(Transfer transfer);

    List<Book> getListOfBookByUser(int userId);
}
