package movies;

import java.util.Arrays;

public class CollectionMovie implements Sortable {

    public static void DisplayMovies() {
        Movie[] movies = FileServices.readFile();
        System.out.println("Ввывод коллекции фильмов");
        for (int i = 0; i < movies.length; i++) {
//            System.out.printf("Название: %s Год производство: %d\nОписание: %s Имя режиссера: %s", movies[i].getName());
            System.out.println(Arrays.toString(movies));
        }
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
