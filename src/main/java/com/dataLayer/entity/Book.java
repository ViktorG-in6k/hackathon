package com.dataLayer.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@javax.persistence.Entity(name = "book")
public class Book extends Entity {
    @Column
    private String name;
    @Column
    private String author;
    @Column
    private String genre;
    @ManyToOne
    private User creator;
    @Column
    private String picture;
    @Column
    private String description;

    @OneToMany(mappedBy = "book",fetch = FetchType.EAGER)
    private List<Transfer> transfers;

    public Book() {
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

    public List<Transfer> getTransfers() {
        return transfers;
    }

    public void setTransfers(List<Transfer> transfers) {
        this.transfers = transfers;
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
}
