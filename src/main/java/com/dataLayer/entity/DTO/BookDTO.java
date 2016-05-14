package com.dataLayer.entity.DTO;

import com.dataLayer.entity.Book;
import com.dataLayer.entity.Transfer;
import com.dataLayer.entity.User;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

public class BookDTO {
    private int id;
    private String name;
    private String author;
    private String genre;
    private User creator;
    private String picture;
    private String description;
    private List<Transfer> transfers;

    public BookDTO(int id, String name, String author, String genre, User creator, String picture, String description, List<Transfer> transfers) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.creator = creator;
        this.picture = picture;
        this.description = description;
        this.transfers = transfers;
    }

    public BookDTO(Book book) {
        this.id = book.getId();
        this.name = book.getName();
        this.author = book.getAuthor();
        this.genre = book.getGenre();
        this.creator = book.getCreator();
        this.picture = book.getPicture();
        this.description = book.getDescription();
        this.transfers = book.getTransfers();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Transfer> getTransfers() {
        return transfers;
    }

    public void setTransfers(List<Transfer> transfers) {
        this.transfers = transfers;
    }
}
