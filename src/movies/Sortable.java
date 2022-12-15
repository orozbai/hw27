package movies;

import java.util.List;

public interface Sortable {
    List<Movie> displayMovie();
    void sortInYear();
    void sortInName();
    void sortInProducer();
}
