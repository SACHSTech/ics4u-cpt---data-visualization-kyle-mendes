package Data.Dataset;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
		List<Movies> movieList = getMovieDetails("src/Data/Dataset/Disneymoviesgood.csv");
		
	//	FlatFileParser
		movieList.forEach((Movies movie) -> System.out.println(movie));

    }
    
    private static List<Movies> getMovieDetails(String file) {
		List<Movies> movieList = new ArrayList<>();
		Path pathToFile = Paths.get("src/Data/Dataset/Disneymoviesgood.csv");
		try (BufferedReader br = Files.newBufferedReader(pathToFile)) {
			String row = br.readLine();
			while (row != null) {
				String[] attributes = row.split(",");
				Movies movie = getOneMovie(attributes);
				movieList.add(movie);
				row = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return movieList;
    }
    
    private static Movies getOneMovie(String[] attributes) {
        String name;
        String date;
		String genre;
		String rating;

        int totalgross;
        int adjustedgross;

        
		try {
			name = attributes[0];
		} catch (Exception e) {
			date = null;
        }
        
        try {
			date = attributes[1];
		} catch (Exception e) {
			date = null;
        }

        try {
			genre = attributes[2];
		} catch (Exception e) {
			genre = null;
		}
        
        try {
			rating = attributes[3];
		} catch (Exception e) {
			rating = null;
        }
        
        try {
			totalgross = Integer.parseInt(attributes[4]);
		} catch (Exception e) {
			totalgross = 0;
        }
        
        try {
			adjustedgross = Integer.parseInt(attributes[5]);
		} catch (Exception e) {
			adjustedgross = 0;
		}
		
		Movies movie = new Movie(name, date, genre, rating, totalgross, adjustedgross);
		return movie;
	}
}
