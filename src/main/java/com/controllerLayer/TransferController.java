package com.controllerLayer;

import com.dataLayer.entity.DTO.BookDTO;
import com.dataLayer.entity.DTO.RequestBook;
import com.dataLayer.entity.DTO.TransferDTO;
import com.serviceLayer.service.interfaces.BookService;
import com.serviceLayer.service.interfaces.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TransferController {
    @Autowired
    TransferService transferService;

    @RequestMapping(value = "/api/books/{bookId}/transfer/{transferId}", method = RequestMethod.POST)
    public
    @ResponseBody
    void newTransfer(@PathVariable("bookId") int bookId,Authentication authentication) {
        transferService.createTransfer(bookId,authentication);
    }

    @RequestMapping(value = "/api/transfer/{transferId}", method = RequestMethod.DELETE)
    public void closeTransfer(@PathVariable("transferId") int transferId) {
        transferService.closeTransfer(transferId);
    }

    @RequestMapping(value = "/api/books/{bookId}/transfers", method = RequestMethod.GET)
    public
    @ResponseBody
    List<TransferDTO> getBookTransferList(@PathVariable("bookId") int bookId) {
       return transferService.getListBookTransfers(bookId);
    }

    @RequestMapping(value = "/api/transfers/current", method = RequestMethod.GET)
    public
    @ResponseBody
    List<TransferDTO> getCurrentBooks(Authentication authentication) {
        return transferService.getCurrentBooks(authentication);
    }

    @RequestMapping(value = "/api/transfers/all", method = RequestMethod.GET)
    public
    @ResponseBody
    List<TransferDTO> getHistoryBooks(Authentication authentication) {
        return transferService.getHistoryBooks(authentication);
    }
}
