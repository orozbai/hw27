package movies;

import java.util.List;

public interface Sortable {
    List<Movie> displayMovie();
    List<Movie> movieSearch();
    void sortInYear();
    void sortInName();
    void sortInProducer();
}
