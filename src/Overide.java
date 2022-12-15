import java.util.List;

public class Overide implements Sortable {
    private final List<Movie> movie;

    public Overide() {
        movie = FileServices.readFile();
    }
    @Override
    public List<Movie> displayMovie() {
        for (var mov : movie) {
        } return movie;
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
