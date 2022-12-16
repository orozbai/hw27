package movies;

import java.util.*;

public class SDSd {

    public static void movieSearch() {
        List<Movie> movie = FileServices.readFile();
        List<Movie> list = new ArrayList<>(movie);

        list.sort(Comparator.comparingInt(Movie::getYear));
        System.out.println(list);
    }
}


