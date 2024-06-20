package mindtek.moviesapp;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovieHW {


/*
Scanner
keep showing menu untill user exits
search by
1. genre
2. director
3. year
4. for children


  1 -> which genre? Drama -> Movies found with given genre: print movie names
 */

    public static void main(String[] args) {
//        List<String> collect = Database.provide().stream().map(m -> m.getGenre()).distinct().sorted()
//                .collect(Collectors.toList());
  //      System.out.println(collect);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which genre of movie would you like to see?");
        System.out.println("Choose from: Action, Adventure, Animation, Biography, Comedy, Crime, Drama, Fantasy, Romance, Sci-Fi, War");
        String genre = scanner.nextLine();
        List<Movie> moviesByGenre = Database.provide().stream()
                .filter(m->m.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
        System.out.println("Which director would you like to choose for movies of genre " + genre + " ?");
//        List<Movie> moviesByDirector = moviesByGenre.stream().map(m->m.getDirector()).collect(Collectors.toList());
//        moviesByDirector.forEach(System.out::println);
//        String director = scanner.nextLine();
//        moviesByDirector.




    }
}
