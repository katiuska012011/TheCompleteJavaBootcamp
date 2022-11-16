package ExeptionHandling.workbooks.movieStore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import ExeptionHandling.workbooks.movieStore.model.Movie;
import ExeptionHandling.workbooks.movieStore.model.Store;

public class Main {

  public static  Store store = new Store();
    public static void main(String[] args) {

        System.out.println("************* JAVA VIDEO STORE*************");

        try {
            loadMovies("/home/kgonzalez/Downloads/education/javaBootcamp/Module 2- worldOfObjects/ExeptionHandling/workbooks/movieStore/movie.txt");
            System.out.println("MOVIES LOADED\n\n");
            System.out.println(store);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }finally{
            manageMovies();
        }
        
    }

    public static void loadMovies(String fileName) throws FileNotFoundException{
        FileInputStream file = new FileInputStream(fileName);
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()){
            String line = scan.nextLine();
            String[] words = line.split("--");
            try {
                Movie movie = new Movie(words[0],words[1], Double.parseDouble(words[2]));
                store.addMovie(movie);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scan.close();
    }

    public static void manageMovies(){
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Would you like to \n\ta)purchase\n\tb)rent\n\tc)return");
            String response = scan.nextLine();      
            String name;
            switch (response) {
                case "b":
                System.out.println("Enter the name of the movie:");
                name = scan.nextLine();
                store.action(name, "rent");
                System.out.println(store);
                    break;
                case "a": 
                System.out.println("Enter the name of the movie:");
                name = scan.nextLine();
                store.action(name, "sell");
                System.out.println(store);
                   break;
                case "c": 
                System.out.println("Enter the name of the movie:");
                name = scan.nextLine();
                store.action(name, "return");
                System.out.println(store);
                break;            
            }
            scan.close();
        }
    }
}
