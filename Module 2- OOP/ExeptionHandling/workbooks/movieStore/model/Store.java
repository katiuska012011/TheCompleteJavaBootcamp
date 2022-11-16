package ExeptionHandling.workbooks.movieStore.model;
import java.util.ArrayList;


public class Store {

    private ArrayList<Movie> movies = new ArrayList<>();

    public Store() {
        this.movies = new ArrayList<>();
    }

    public Movie getMovies(int index) {
        return new Movie(this.movies.get(index));
    }

    public void setMovies(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    public void addMovie(Movie movie){
        this.movies.add(movie);
    }

    public void action(String name, String action){

        if(name.equals(null) || name.isBlank()){
            throw new IllegalArgumentException("The name cannot be null/black");
        }

        for (int i = 0; i < movies.size(); i++) { 
            if(movies.get(i).getName().equals(name)){
                switch (action) {
                    case "sell":this.movies.remove(i);
                        break;
                    case "rent": this.movies.get(i).setAvailable(false);
                        break;
                    case "return": this.movies.get(i).setAvailable(true);
                        break;
                }
            }
        }      

    }

    @Override
    public String toString() {
        String temp = "";

        for (int i = 0; i < movies.size(); i++) {
            temp += movies.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }

}
