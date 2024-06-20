package mindtek.moviesapp;

import java.util.List;
import java.util.stream.Collectors;

public class Website {
    public static void main(String[] args) {
 //   for(Movie m: Database.provide()) System.out.println(m);

      List<Movie> movies = searchByGenre("Crime");
      List<Movie> moviesByDirector = searchByDirector("Nolan");
      List<Movie> moviesByYear = searchByYear( 2015, 2000);;
      print(moviesByYear);
    }


    private static List<Movie> searchByYear(int year1, int year2) {
        return Database.provide().stream().filter(m->m.getReleaseYear()>=year1 && m.getReleaseYear()<=year2)
                .collect(Collectors.toList());
    }

    private static List<Movie> searchByDirector(String dirName) {
        return Database.provide().stream().filter(m->m.getDirector().contains(dirName))
                .collect(Collectors.toList());
    }

    public static void print(List<Movie> movies){
//       int num =1;
//        for(Movie m: movies){
//            System.out.println(num + ") " + m);
//            num++;
//        }
        movies.forEach(System.out::println);
    }

     private static List<Movie> searchByGenre(String genre) {
//        ArrayList<Movie> list = new ArrayList<>();
//        for(Movie m: Database.provide()) if(m.getGenre().equalsIgnoreCase(genre)) list.add(m);
//            return list;
         return Database.provide().stream()
                 .filter(m->m.getGenre().equalsIgnoreCase(genre))
                 .collect(Collectors.toList());
        }


    }



