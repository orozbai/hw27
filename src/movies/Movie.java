package movies;

import java.util.List;

public class Movie {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> casts;

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCasts() {
        return casts;
    }

    public void setCasts(List<Cast> casts) {
        this.casts = casts;
    }



    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return String.format("Название %s, Год %d, Описание %s, Режиссер: %s", name, year, description, director.getFullName());
    }

//    @Override
//    public String toString() {
//        return "Movie{" +
//                "name='" + name + '\'' +
//                ", year=" + year +
//                ", description='" + description + '\'' +
//                ", director=" + director +
//                ", casts=" + casts +
//                '}';
//    }
}