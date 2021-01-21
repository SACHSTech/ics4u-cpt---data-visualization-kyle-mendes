package Data;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
		
		String name;
		String date;
		String genre;
		String rating;
		int totalgross;
		int adjustedgross;

		String line = "";
		int count = 0;
		Movies movie;
		Movies[] movies = new Movies[514];

		BufferedReader thefile = new BufferedReader(new FileReader("src/Data/Disneymoviesgood.csv"));
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

		while(count < 514) {
			line = thefile.readLine();
			String[] space = line.split(", ");

			
			name = space[0];
			date = space[1];
			genre = space[2];
			rating = space[3];
			totalgross = Integer.parseInt(space[4]);
			adjustedgross = Integer.parseInt(space[5]);	
			

			// try stuff
			/*
			try {
				name = space[0];
			} catch (Exception e) {
				name = null;
			}

			try {
				date = space[1];
			} catch (Exception e) {
				date = null;
			}

			try {
				genre = space[2];
			} catch (Exception e) {
				genre = null;
			}

			try {
				rating = space[3];
			} catch (Exception e) {
				rating = null;
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