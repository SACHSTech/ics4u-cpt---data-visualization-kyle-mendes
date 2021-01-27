/*
package Movies;

import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class disneymovies {
    public static void main(String[] args) throws IOException {

        List<Movie> movies2 = readMoviesFromCSV("src/Movies/Disneymoviesgood.csv");
        
        //print items
        for (Movie m : movies) {
            System.out.println(m);
        }

    }

    private static List<Movie> readMoviesFromCSV(String filename) {
        List<Movie> movies2 = new ArrayList<>();

        try (BufferedReader mo = new BufferedReader(new FileReader("src/Movies/Disneymoviesgood.csv"))) {

            String line = mo.readLine();

            while (line != null) {
                String[] attributes = line.split(", ");

                Movie movie = createMovie(attributes);

                movies2.add(movie);

                line = mo.readLine();
            } 

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return movies;

    }

    private static Movie creatMovie(String[] metadata) {
        String name = metadata[0];
        String date = metadata[1];
        String genre = metadata[2];
        Double rating = double.Parse[3];
        int totalgross = Integer.parseInt[4];
        int totaladjusted = Integer.parseInt[5];

        return new Book(name, date, genre, rating, totalgross, totaladjusted);
    }

        /*
        Scanner list = new Scanner(new File("src/Movies/Disneymoviesgood.csv"));
        list.useDelimiter(", ");

        while (list.hasNext()) {
            System.out.println(list.next());
        }

        list.close();
        
    }
}

package Movies;
 
import java.io.*;

public class disneymovies{
    public static void main(Strings[] args) throws IOException{
        BufferedReader thefile = new BufferedReader(new FileReader("src/Movies/Disneymoviesgood.csv"));
 
        String name;
        String date;
        String genre;
        String rating;
        String totalgross;
        String adjustedgross;
 
        while(thefile.readLine() != null) {
            String movie[] = file.readLine().split(", ");
            name = data[0];
            date = data[1];
            genre = data[2];
            rating = data[3];
            totalgross = data[4];
            adjustedgross = data[5];
 
            System.out.println(name + " " + date + " " + genre + " " + rating + " " + totalgross + " " + adjustedgross);
        }
 
        file.close();
 
    }
}
 
*/
 
 
 

