package com.driver;

public class Director {

    private String name;
    private int numberOfMovies;
    private double imdbRating;

    public Director(){

    }

    public Director(String name, int numberOfMovies, double imbRating) {
        this.name = name;
        this.numberOfMovies = numberOfMovies;
        this.imdbRating = imbRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public double getImbRating() {
        return imdbRating;
    }

    public void setImbRating(double imbRating) {
        this.imdbRating = imbRating;
    }
}