package Data;

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
			//totalgross = 5;
			//adjustedgross = 6;
			totalgross = Integer.parseInt(space[4]);
			adjustedgross = Long.parseLong(space[5]);	
			

			// try stuff
			/*
			try {
				name = space[0];
			} catch (Exception e) {
				name = "t ";
			}

			try {
				date = space[1];
			} catch (Exception e) {
				date = "i ";
			}

			try {
				genre = space[2];
			} catch (Exception e) {
				genre = "h ";
			}

			try {
				rating = space[3];
			} catch (Exception e) {
				rating = "r ";
			}

			try {
				totalgross = Integer.parseInt(space[4]);
			} catch (Exception e) {
				totalgross = 0;
			}

			try {
				adjustedgross = Integer.parseInt(space[5]);
			} catch (Exception e) {
				adjustedgross = 0;
			}
			*/
			

			movie = new Movies(name, date, genre, rating, totalgross, adjustedgross);
			System.out.println(movie);
			movies[count] = movie;
			
			count++;	
		}

		thefile.close();


		
		


	}

}