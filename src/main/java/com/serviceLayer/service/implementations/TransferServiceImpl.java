package com.serviceLayer.service.implementations;

import com.dataLayer.DAO.interfaces.TransferDAO;
import com.dataLayer.entity.Book;
import com.dataLayer.entity.DTO.TransferDTO;
import com.dataLayer.entity.Transfer;
import com.dataLayer.entity.User;
import com.serviceLayer.service.interfaces.BookService;
import com.serviceLayer.service.interfaces.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TransferServiceImpl implements TransferService {
    @Autowired
    TransferDAO transferDAO;
    @Autowired
    BookService bookService;

    @Override
    public void createTransfer(int bookId, Authentication authentication) {
        User creator = ((User) authentication.getPrincipal());
        Book book = bookService.getBookById(bookId);
        Transfer transfer = new Transfer(book,creator);
        transferDAO.save(transfer);
    }

    @Override
    public void closeTransfer(int transferId) {
        Transfer transfer = transferDAO.getTransferById(transferId);
        transfer.setDatePush(LocalDateTime.now());
        bookService.remoteOwner(transfer.getBook().getId());
        transferDAO.closeTransfer(transfer);
    }

    @Override
    public List<TransferDTO> getListBookTransfers(int bookId){
        List<TransferDTO>transferDTOs = new ArrayList<>();
        List<Transfer> transfers = transferDAO.getListOfBookTransfer(bookId);
        for(Transfer transfer: transfers){
            transferDTOs.add(new TransferDTO(transfer));
        }
        return transferDTOs;
    }

}
