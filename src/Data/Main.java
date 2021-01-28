package Data;

// import java items i need
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;

public class Main extends Application {

	// initialize variables for charts
	// bar graph
	static int Chart;
	static double action2;
	static double adventure2;
	static double bcom2;
	static double comedy2;
	static double drama2;
	static double horror2;
	static double musical2;
	static double romcom2;
	static double thriller2;
	static double western2;

	// line graph
	static double g2;
	static double notrated;
	static double pg2;
	static double pg132;
	static double r2;

	// pie chart
	static int action3;
	static int adventure3;
	static int bcom3;
	static int comedy3;
	static int concert3;
	static int doc3;
	static int drama3;
	static int horror3;
	static int musical3;
	static int romcom3;
	static int thriller3;
	static int western3;

	// method to clear the screen
	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}

	// method to pause the screen
	private static void sleep(int length) {
        try {
			Thread.sleep(length);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

    public static void main(String[] args) throws IOException {

		// initialize loop variables
		Boolean exit = true;
		String Choice;
		
		// initialize variables to read file
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

		// add file reader and input reader
		BufferedReader thefile = new BufferedReader(new FileReader("src/Data/Disneymoviesgood.csv"));
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

		// read all the data
		while (count < 513) {
			line = thefile.readLine();
			String[] space = line.split(",");

			// add data to movie object
			name = space[0];
			date = space[1];
			genre = space[2];
			rating = space[3];
			totalgross = Integer.parseInt(space[4]);
			adjustedgross = Long.parseLong(space[5]);	
			
			// create movie object
			movie = new Movies(name, date, genre, rating, totalgross, adjustedgross);
			movies[count] = movie;
			
			count++;	
		}

		// close the file
		thefile.close();

		// welcome screen
		System.out.println("Welcome to Disney Movies Database");
		System.out.println("Here are all Disney movies with their release date, genre, mpa rating, total and inflated adjusted gross.");
		System.out.println("The data here is up until 2016.");

		// Start the simulation loop
		while (exit) {
			// main menu
			exit = true;
			System.out.println();
			System.out.println("Welcome to the main menu please select an option from below:");
			System.out.println("------------------------------------------------------------");
			System.out.println("1 - Search for specific data value");
			System.out.println("2 - View an individual movie");
			System.out.println("3 - View filtered data by genre and rating");
			System.out.println("4 - View summary of data");
			System.out.println("5 - View data sorted by total gross");
			System.out.println("6 - View charts");
			System.out.println("7 - Exit");
			System.out.print("Enter your choice: ");
			Choice = key.readLine();
			System.out.println();

			// Go to user destination
			// View Search data
			if (Choice.equals("1")) {
				System.out.println("Please select which data type you would like to search for:");
				System.out.println("1 - Name \n2 - Date \n3 - Genre \n4 - Rating \n5 - Total gross \n6 - Adjusted gross");
				sleep(300);
				System.out.print("Your choice: ");
				String Choicex = key.readLine();

				// Search by name
				if (Choicex.equals("1")) {
					System.out.print("Please enter name: ");
					Choicex = key.readLine();
					System.out.println(Search.nameSearch(movies, Choicex));

					// Main menu or exit
					System.out.println("\n1 - Main Menu  \n2 - Exit");
					System.out.print("Your choice: ");
					Choicex = key.readLine();
					if (Choicex.equals("1")) {
						sleep(300);
						clearScreen();
						exit = true;	
					} else if (Choicex.equals("2")) {
						clearScreen();
						System.out.println("Thank you for visiting!");
						exit = false;
					}
					
				// Search by date
				} else if (Choicex.equals("2")) {
					System.out.print("Please enter date: ");
					Choicex = key.readLine();
					System.out.println(Search.dateSearch(movies, Choicex));

					// Main menu or exit
					System.out.println("1 - Main Menu \n2 - Exit");
					System.out.print("Your choice: ");
					Choicex = key.readLine();
					if (Choicex.equals("1")) {
						sleep(300);
						clearScreen();
						exit = true;	
					} else if (Choicex.equals("2")) {
						clearScreen();
						System.out.println("Thank you for visiting!");
						exit = false;
					}
						
				// Search by genre
				} else if (Choicex.equals("3")) {
					System.out.print("Please enter genre: ");
					Choicex = key.readLine();
					//Search.genreSearch(movies, Choicex).toString();
					System.out.println(Search.genreSearch(movies, Choicex));

					// Main menu or exit
					System.out.println("1 - Main Menu \n2 - Exit");
					System.out.print("Your choice: ");
					Choicex = key.readLine();
					if (Choicex.equals("1")) {
						sleep(300);
						clearScreen();
						exit = true;	
					} else if (Choicex.equals("2")) {
						clearScreen();
						System.out.println("Thank you for visiting!");
						exit = false;
					}
					
				// Search by mpa rating
				} else if (Choicex.equals("4")) {
					System.out.print("Please enter rating: ");
					Choicex = key.readLine();
					System.out.println(Search.ratingSearch(movies, Choicex));
					//Search.ratingSearch(movies, Choicex).toString();

					// Main menu or exit
					System.out.println("1 - Main Menu \n2 - Exit");
					System.out.print("Your choice: ");
					Choicex = key.readLine();
					if (Choicex.equals("1")) {
						sleep(300);
						clearScreen();
						exit = true;	
					} else if (Choicex.equals("2")) {
						clearScreen();
						System.out.println("Thank you for visiting!");
						exit = false;
					}
					
				// Search by total gross
				} else if (Choicex.equals("5")) {
					System.out.print("Please enter total gross: ");
					Choicex = key.readLine();
					int Choicen = Integer.parseInt(Choicex);
					System.out.println(Search.totalgrossSearch(movies, Choicen));

					// Main menu or exit
					System.out.println("\n1 - Main Menu \n2 - Exit");
					System.out.print("Your choice: ");
					Choicex = key.readLine();
					if (Choicex.equals("1")) {
						sleep(300);
						clearScreen();
						exit = true;	
					} else if (Choicex.equals("2")) {
						clearScreen();
						System.out.println("Thank you for visiting!");
						exit = false;
					}
					
				// Search by adjusted gross
				} else if (Choicex.equals("6")) {
					System.out.print("Please enter adjusted gross: ");
					Choicex = key.readLine();
					Long Choicen = Long.parseLong(Choicex);
					System.out.println(Search.adjustedgrossSearch(movies, Choicen));

					// Main menu or exit
					System.out.println("1 - Main Menu \n2 - Exit");
					System.out.print("Your choice: ");
					Choicex = key.readLine();
					if (Choicex.equals("1")) {
						sleep(300);
						clearScreen();
						exit = true;	
					} else if (Choicex.equals("2")) {
						clearScreen();
						System.out.println("Thank you for visiting!");
						exit = false;
					}
					
				}

			// Search for an individual movie
			} else if (Choice.equals("2")) {
				System.out.println("Please enter the following information:");
				System.out.print("Name: ");
				String name2 = key.readLine();
				System.out.print("Date: ");
				String date2 = key.readLine();
				System.out.print("Genre: ");
				String genre2 = key.readLine();
				System.out.print("Rating: ");
				String rating2 = key.readLine();
				System.out.print("Total gross: ");
				String totalgross2s = key.readLine();
				int totalgross2 = Integer.parseInt(totalgross2s);
				System.out.print("Adjusted gross: ");
				String adjustedgross2s = key.readLine();
				Long adjustedgross2 = Long.parseLong(adjustedgross2s);

				System.out.println(Search.individualSearch(movies, name2, date2, genre2, rating2, totalgross2, adjustedgross2));

				// Main menu or exit
				System.out.println("1 - Main Menu \n2 - Exit");
				System.out.print("Your choice: ");
				String Choicex = key.readLine();
				if (Choicex.equals("1")) {
					sleep(300);
					clearScreen();
					exit = true;	
				} else if (Choicex.equals("2")) {
					clearScreen();
					System.out.println("Thank you for visiting!");
					exit = false;
				}

			// Search by filters
			} else if (Choice.equals("3")) {
				System.out.println("Here you are able to filter the movies by genre and rating.");
				System.out.print("Genre: ");
				String genre2 = key.readLine();
				System.out.print("Rating: ");
				String rating2 = key.readLine();

				Search.Filterdata(movies, genre2, rating2).toString();

				// Main menu or exit
				System.out.println("\n 1 - Main Menu \n2 - Exit");
				System.out.print("Your choice: ");
				String Choicex = key.readLine();
				if (Choicex.equals("1")) {
					sleep(300);
					clearScreen();
					exit = true;	
				} else if (Choicex.equals("2")) {
					clearScreen();
					System.out.println("Thank you for visiting!");
					exit = false;
				}

			// Print summary of the data
			} else if (Choice.equals("4")) {
				System.out.println("Summary Information");
				System.out.println("Total movies: " + movies.length);
				System.out.println("Max total gross: " + Summary.MaxValue(movies));
				System.out.println("Min total gross: " + Summary.MinValue(movies));
				System.out.println("Average total gross: " + Summary.Average(movies));
				System.out.println("Median total gross: " + Sort.Median(movies));
				System.out.println("Standard deviation for total gross: " + Summary.standardDeviation(movies));

				// Main menu or exit
				System.out.println("\n1 - Main Menu \n2 - Exit");
				System.out.print("Your choice: ");
				String Choicex = key.readLine();
				if (Choicex.equals("1")) {
					sleep(300);
					clearScreen();
					exit = true;	
				} else if (Choicex.equals("2")) {
					clearScreen();
					System.out.println("Thank you for visiting!");
					exit = false;
				}

			// View sorted data
			} else if (Choice.equals("5")) {
				System.out.println("Would you like the data sorted");
				System.out.println("1 - low to high or 2 - high to low: ");
				System.out.print("Your choice: ");
				String Choicey = key.readLine();

				// Sort by least total gross
				if (Choicey.equals("1")) {
					Sort.sortMin(movies);

					for (int i = 0; i < movies.length; i++) {
                        System.out.println(movies[i]);
					}
					
				// Sort by greatest total gross
				} else if (Choicey.equals("2")) {
					Sort.sortMax(movies);

					for (int i = 0; i < movies.length; i++) {
                        System.out.println(movies[i]);
					}
				}

				// Main menu or exit
				System.out.println("\n1 - Main Menu \n2 - Exit");
				System.out.print("Your choice: ");
				String Choicex = key.readLine();
				if (Choicex.equals("1")) {
					sleep(300);
					clearScreen();
					exit = true;	
				} else if (Choicex.equals("2")) {
					clearScreen();
					System.out.println("Thank you for visiting!");
					exit = false;
				}

			// View charts
			} else if (Choice.equals("6")) {
				System.out.println("Which chart do you want to see:");
				System.out.println("1 - Bar graph (Average total gross per genre)");
				System.out.println("2 - Line graph (Average total gross per mpa rating");
				System.out.println("3 - Pie chart (Number of movies per genre");
				System.out.print("Your choice: ");
				String Choicey = key.readLine();

				// View barchart
				if (Choicey.equals("1")) {
					action2 = Summary.Avggenre(movies, "Action");
					adventure2 = Summary.Avggenre(movies, "Adventure");
					bcom2 = Summary.Avggenre(movies, "Black Comedy");
					comedy2 = Summary.Avggenre(movies, "Comedy");
					drama2 = Summary.Avggenre(movies, "Drama");
					horror2 = Summary.Avggenre(movies, "Horror");
					musical2 = Summary.Avggenre(movies, "Musical");
					romcom2 = Summary.Avggenre(movies, "Romantic Comedy");
					thriller2 = Summary.Avggenre(movies, "Thriller/Suspense");
					western2 = Summary.Avggenre(movies, "Western");

					Chart = 1;
					launch(args);
			
				// View linechart
				} else if (Choicey.equals("2")) {
					g2 = Summary.Avgrate(movies, "G");
					notrated = Summary.Avgrate(movies, "Not Rated");
					pg2 = Summary.Avgrate(movies, "PG");
					pg132 = Summary.Avgrate(movies, "PG-13");
					r2 = Summary.Avgrate(movies, "R");

					Chart = 2;
					launch(args);
				}
				
				// View piechart
				else if (Choicey.equals("3")) {
					action3 = Summary.countGenre(movies, "Action");
					adventure3 = Summary.countGenre(movies, "Adventure");
					bcom3 = Summary.countGenre(movies, "Black Comedy");
					comedy3 = Summary.countGenre(movies, "Comedy");
					concert3 = Summary.countGenre(movies, "Concert/Performance");
					doc3 = Summary.countGenre(movies, "Documentary");
					drama3 = Summary.countGenre(movies, "Drama");
					horror3 = Summary.countGenre(movies, "Horror");
					musical3 = Summary.countGenre(movies, "Musical");
					romcom3 = Summary.countGenre(movies, "Romantic Comedy");
					thriller3 = Summary.countGenre(movies, "Thriller/Suspense");
					western3 = Summary.countGenre(movies, "Western");

					Chart = 3;
					launch(args);
					
				}
			
			// Exit
			} else if (Choice.equals("7")) {
				clearScreen();
				System.out.println("Thank you for visiting!");
				exit = false;

			// Invalid number try again
			} else {
				System.out.println("Invalid Entry - please try again");
				exit = true;
			}

		}

	}

	// Runs the charts
	public void start(Stage primaryStage) throws Exception {
		if(Chart == 1) {
			primaryStage.setScene(new Scene(Graphs.barchart(action2, adventure2, bcom2, comedy2, drama2, horror2, musical2, romcom2, thriller2, western2)));
		} 

		else if(Chart == 2) {
			primaryStage.setScene(new Scene(Graphs.linechart(g2, notrated, pg2, pg132, r2)));
				
		}

		else if (Chart == 3) {
			primaryStage.setScene(new Scene(Graphs.piechart(action3, adventure3, bcom3, comedy3, concert3, doc3, drama3, horror3, musical3, romcom3, thriller3, western3)));
		}
		primaryStage.show();
	}

}