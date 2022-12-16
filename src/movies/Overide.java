package movies;

import movies.Sortable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Overide implements Sortable {
    private final List<Movie> movieList;

    public Overide() {
        movieList = FileServices.readFile();
    }

    @Override
    public List<Movie> displayMovie() {
        for (var m : movieList) {
        }
        return movieList;
    }

    @Override
    public List<Movie> movieSearch() {
        List<Movie> movie = FileServices.readFile();
        List<Movie> list = new ArrayList<>(movie);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Искать фильм по названию: ");
        String searchTerm = scanner.nextLine();

        for (Movie v : list) {
            if (v.getName().contains(searchTerm)) {
                System.out.println(v.getName());
            }
        }
        return null;
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
