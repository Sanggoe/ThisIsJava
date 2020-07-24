package com.sanggoe.test2;

public class Book {
    String title;
    int pages;
    String writer;

    public Book(String title, int pages, String writer) {
        this.title = title;
        this.pages = pages;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "책이름 : " + title + "\n페이지 수 : " + pages + "\n저자 : " + writer;
    }
}
