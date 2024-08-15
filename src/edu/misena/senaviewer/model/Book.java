package edu.misena.senaviewer.model;

public class Book {

    int id;
    String title;
    String editionDate;
    String editorial;
    String authors;
    int isbn;
    boolean readed;
    int timeReaded;

    public Book(String title, String editionDate, String editorial, int isbn) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(String editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

}