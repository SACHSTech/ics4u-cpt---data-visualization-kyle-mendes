package Data;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
		
		String name;
		String date;
		String genre;
		String rating;
		int totalgross;
		long adjustedgross;

		String line = "";
		int count = 0;
		Movies movie;
		Movies[] movies = new Movies[513];

		BufferedReader thefile = new BufferedReader(new FileReader("src/Data/Disneymoviesgood.csv"));
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

		while(count < 513) {
			line = thefile.readLine();
			String[] space = line.split(",");

			
			name = space[0];
			date = space[1];
			genre = space[2];
			rating = space[3];
			totalgross = Integer.parseInt(space[4]);
			adjustedgross = Long.parseLong(space[5]);	
			
			movie = new Movies(name, date, genre, rating, totalgross, adjustedgross);
			System.out.println(movie);
			movies[count] = movie;
			
			count++;	
		}

		thefile.close();


		
		


	}

}