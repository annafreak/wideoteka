import java.util.Scanner;
import java.util.ArrayList;

class VideoLibrary{

    ArrayList<String> movies = new ArrayList<String>();

    public void addMovie(String movie){
        movies.add(movie);
        System.out.println("dodano film: " + movie);
    }
    public void displayMovies(){
        System.out.println(" lista filmow: " + movies);
    }
    public void searchMovie(String movie){
        if(movies.contains(movie)){
            System.out.println("film istnieje " + movie);
        }else{
            System.out.println("film nie istnieje " + movie);
        }

    }
    public void removeMovie(String movie){
        movies.remove(movie);
        System.out.println("film zostal usunienty " + movie);
    }
    public void countMovie(){
        System.out.println("ilosc filmow:  " + movies.size());

    }
    public void filterMoviesByLetter(){
        Scanner sc = new Scanner(System.in);

        String a=sc.nextLine();

        movies.stream()
                .filter(x -> x.startsWith(a))
                .forEach(System.out::println);

    }
    public static void welcomeMessage() {
        System.out.println("witaj w systemie zarzadzania wideoteka!");
    }

}



public class Main {
    public static void main(String[] args) {


    VideoLibrary library = new VideoLibrary();
    library.welcomeMessage();
    library.addMovie("The Godfather");
    library.addMovie("nigeriano");
    library.addMovie("asiano mit jewiano");
    library.displayMovies();

    library.countMovie();
    library.removeMovie("nigeriano");
    library.displayMovies();
    library.filterMoviesByLetter();



    }
}