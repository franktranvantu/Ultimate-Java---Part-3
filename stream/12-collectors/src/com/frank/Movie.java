package com.frank;

public class Movie {

    private String title;
    private int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", likes=" + likes +
                '}';
    }
}
