package movies;

import movies.Sortable;

import java.util.List;

public class Overide implements Sortable {
    private final List<Movie> movieList;

    public Overide() {
        movieList = FileServices.readFile();
    }

    @Override
    public List<Movie> displayMovie() {
        for (var m : movieList) {
        } return movieList;
    }

    @Override
    public void sortInYear() {

    }

    @Override
    public void sortInName() {

    }

    @Override
    public void sortInProducer() {

    }
}
