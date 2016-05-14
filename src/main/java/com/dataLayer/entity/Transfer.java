package com.dataLayer.entity;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@javax.persistence.Entity(name = "transfer")
public class Transfer extends Entity {
    @Column
    private LocalDateTime datePull;

    @Column
    private LocalDateTime datePush;

    @Column
    @ManyToOne
    private Book book;

    @Column
    @ManyToOne
    private User user;

    public Transfer(){

    }

    public LocalDateTime getDatePull() {
        return datePull;
    }

    public void setDatePull(LocalDateTime datePull) {
        this.datePull = datePull;
    }

    public LocalDateTime getDatePush() {
        return datePush;
    }

    public void setDatePush(LocalDateTime datePush) {
        this.datePush = datePush;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
