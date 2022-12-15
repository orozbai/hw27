package movies;

import java.util.*;

public class SDSd {
    // Import the necessary classes
    private static List<Movie> movie;

    public static void MovieSearch() {
        movie = FileServices.readFile();
        ArrayList<Movie> movies1 = new ArrayList<>(movie);
        //Create an ArrayList to store the movie titles
//        ArrayList<String> movies = new ArrayList<String>();

        // Add some movie titles to the ArrayList

//        movies.add("The Shawshank Redemption");
//        movies.add("The Godfather");
//        movies.add("The Godfather: Part II");
//        movies.add("The Dark Knight");
//        movies.add("12 Angry Men");
//        movies.add("Schindler's List");
//        movies.add("The Lord of the Rings: The Return of the King");
//        movies.add("Pulp Fiction");
//        movies.add("The Good, the Bad and the Ugly");
//        movies.add("Fight Club");

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a search term
        System.out.print("Enter a search term: ");
        String searchTerm = scanner.nextLine();



        // Search for movies that contain the search term in their title
        for (Movie movie : movies1) {

            if (movies1.contains(searchTerm)) {
                // If the search term is found, display the movie title
                System.out.println(movie);
            }
        }
    }

}
