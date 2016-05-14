package com.serviceLayer.service.interfaces;

import com.dataLayer.entity.DTO.BooksResponceDTO;

import java.util.List;

public interface BookService {
    List<BooksResponceDTO> getAllBook();
}
