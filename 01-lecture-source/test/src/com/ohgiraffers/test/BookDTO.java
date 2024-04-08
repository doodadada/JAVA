package com.ohgiraffers.test;

public class BookDTO {
    private static int nextId = 1;
    private int id;
    private String author;
    private String title;

    public BookDTO(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public BookDTO(String author, String title) {
        this.id = BookDTO.nextId++;
        this.author = author;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
