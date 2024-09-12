package edu.misena.senaviewer.model;

public class film {

    int id;
    String title;
    String genre;
    String creator;
    int duration;
    int year;
    boolean viewed;

    public film(String title, String genre, String creator,int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.creator=creator;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void getDuration(int duration) {
        this.duration = duration;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    private static void librocompleto() {

    }
    @Override
    public String toString() {
        return "film{" +
                super.toString() +
                ", id=" + id +
                ", title=" + title +
                ", genre=" + genre +
                ", creator=" + creator +
                ", duration=" + duration +
                ", year=" + year +
                ", viewed=" + viewed +
                '}';
    }
}



