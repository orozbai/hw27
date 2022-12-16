package movies;

import java.util.List;

public class Run {
    public void run(){
        Overide cnm = new Overide();
        List<Movie> choiceMovie = cnm.displayMovie();
        printMovieList(choiceMovie);
    }
    private  void printMovieList(List<Movie> movies) throws NullPointerException {
        for (var mov : movies) {
            System.out.println(mov);
        }
    }
}