package edu.misena.senaviewer.model;

public class Movie extends film{

    int id;
    String title;
    String genre;
    String creator;
    int duration;
    int year;
    boolean viewed;
    int timeviewed;

    public Movie(String title, String genre, String creator, int duration) {
     super(title, genre, creator, duration);
     this.year= year;
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
}

    @Override
    public String toString() {
        return "Movie{" +
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
