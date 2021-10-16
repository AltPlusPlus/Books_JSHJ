package com.atlPlusPlus.model;

import java.util.Objects;

public class Books {

    private String username;
    private int bookid;
    private String bookname;
    private String author;
    private String price;

    public Books(String username, int bookid, String bookname, String author, String price) {
        this.username = username;
        this.bookid = bookid;
        this.bookname = bookname;
        this.author = author;
        this.price = price;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return bookid == books.bookid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookid);
    }
}