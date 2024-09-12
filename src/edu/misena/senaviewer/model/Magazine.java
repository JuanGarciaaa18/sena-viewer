package edu.misena.senaviewer.model;

public class Magazine extends publication {

    int id;
    String title;
    String editionDate;
    String editorial;
    String authors;

    public Magazine(String title, String editionDate, String editorial) {
        super(title,editionDate,editorial);
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
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


    @Override
    public String toString() {
        return "Serie{" +
                super.toString() +
                ", id=" + id +
                ", title=" + title +
                ", Editiondate=" + editiondate +
                ", Editorial=" + editorial +
                ", Authors=" + authors +
                '}';


    }
}
