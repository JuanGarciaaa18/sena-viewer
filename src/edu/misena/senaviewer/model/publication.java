package edu.misena.senaviewer.model;


public class publication {

    String title;
    String editiondate;
    String editorial;
    String authors;


    public publication(String title, String editiondate, String editorial) {
        this.title = title;
        this.editiondate = editiondate;
        this.editorial = editorial;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditiondate() {
        return editiondate;
    }

    public void setEditiondate(String editiondate) {
        this.editiondate = editiondate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }





}