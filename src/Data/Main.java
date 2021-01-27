package Data;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jdk.internal.org.objectweb.asm.util.TraceModuleVisitor;

import java.io.*;

public class Main extends Application {

	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}

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
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

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

		System.out.println("Welcome to Disney Movies Database");
		System.out.println("Here are all Disney movies with their release date, genre, rating, total and inflated adjusted gross.");
		System.out.println("The data here is up until 2016.");

		//Start the simulation loop
		Boolean exit = true;
		String Choice;
		while(exit) {
			exit = true;
			System.out.println();
			System.out.println("Welcome to the main menu please select an option from below:");
			System.out.println("------------------------------------------------------------");
			System.out.println("1 - View sorted data by total gross");
			System.out.println("2 - View an individual movie");
			System.out.println("3 - View filtered data");
			// System.out.println("4 - View an individual movie");
			System.out.println("5 - View summary of the data");
			System.out.println("6 - View charts");
			System.out.println("7 - Exit");
			System.out.print("Enter your choice: ");
			Choice = key.readLine();

			// Go to user destination
			// View Sorted data
			if(Choice.equals("1")) {
				System.out.println("Please select which data type you would like to search for:");
				System.out.println("1 - Name \n 2 - Date \n 3 - Genre \n 4 - Rating \n 5 - Total gross \n 6 - Adjusted gross");
				String Choicex = key.readLine();

				if(Choicex.equals("1")) {
					System.out.print("Please enter name: ");
					Choicex = key.readLine();
					Search.nameSearch(movies, Choicex).toString();

					System.out.println("\n 1 - Main Menu  \n 2 - Exit");
					Choicex = key.readLine();
					if(Choicex.equals("1")) {
						Thread.sleep(300);
						clearScreen();
						exit = true;	
					} else if(Choicex.equals("2")) {
						clearScreen();
						System.out.println("Thank you for visiting!");
						exit = false;
					}
					
				} else if(Choicex.equals("2")) {
					System.out.print("Please enter date: ");
					Choicex = key.readLine();
					Search.dateSearch(movies, Choicex).toString();

					System.out.println("\n 1 - Main Menu \n 2 - Exit");
					Choicex = key.readLine();
					if(Choicex.equals("1")) {
						Thread.sleep(300);
						clearScreen();
						exit = true;	
					} else if(Choicex.equals("2")) {
						clearScreen();
						System.out.println("Thank you for visiting!");
						exit = false;
					}
					
				} else if(Choicex.equals("3")) {
					System.out.print("Please enter genre: ");
					Choicex = key.readLine();
					Search.genreSearch(movies, Choicex).toString();

					System.out.println("\n 1 - Main Menu \n 2 - Exit");
					Choicex = key.readLine();
					if(Choicex.equals("1")) {
						Thread.sleep(300);
						clearScreen();
						exit = true;	
					} else if(Choicex.equals("2")) {
						clearScreen();
						System.out.println("Thank you for visiting!");
						exit = false;
					}
					
				} else if(Choicex.equals("4")) {
					System.out.print("Please enter rating: ");
					Choicex = key.readLine();
					Search.ratingSearch(movies, Choicex).toString();

					System.out.println("\n 1 - Main Menu \n 2 - Exit");
					Choicex = key.readLine();
					if(Choicex.equals("1")) {
						Thread.sleep(300);
						clearScreen();
						exit = true;	
					} else if(Choicex.equals("2")) {
						clearScreen();
						System.out.println("Thank you for visiting!");
						exit = false;
					}
					
				} else if(Choicex.equals("5")) {
					System.out.print("Please enter total gross: ");
					Choicex = key.readLine();
					int Choicen = Integer.parseInt(Choicex);
					Search.totalgrossSearch(movies, Choicen).toString();

					System.out.println("\n 1 - Main Menu \n 2 - Exit");
					Choicex = key.readLine();
					if(Choicex.equals("1")) {
						Thread.sleep(300);
						clearScreen();
						exit = true;	
					} else if(Choicex.equals("2")) {
						clearScreen();
						System.out.println("Thank you for visiting!");
						exit = false;
					}
					
				} else if(Choicex.equals("6")) {
					System.out.print("Please enter total gross: ");
					Choicex = key.readLine();
					Long Choicen = Long.parseLong(Choicex);
					Search.adjustedgrossSearch(movies, Choicen).toString();

					System.out.println("\n 1 - Main Menu \n 2 - Exit");
					Choicex = key.readLine();
					if(Choicex.equals("1")) {
						Thread.sleep(300);
						clearScreen();
						exit = true;	
					} else if(Choicex.equals("2")) {
						clearScreen();
						System.out.println("Thank you for visiting!");
						exit = false;
					}
					
				}

			} else if(Choice.equals("2")) {
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
				Long adjustedgross2 = Long.parseLong(totalgross2s);

				Search.individualSearch(movies, name2, date2, genre2, rating2, totalgross2, adjustedgross2);

				System.out.println("\n 1 - Main Menu \n 2 - Exit");
				String Choicex = key.readLine();
				if(Choicex.equals("1")) {
					Thread.sleep(300);
					clearScreen();
					exit = true;	
				} else if(Choicex.equals("2")) {
					clearScreen();
					System.out.println("Thank you for visiting!");
					exit = false;
				}

			} else if(Choice.equals("3")) {
				System.out.println("Here you are able to filter the movies by genre and rating.");
				System.out.println("Genre: ");
				String genre2 = key.readLine();
				System.out.println("Rating: ");
				String rating2 = key.readLine();

				Search.Filterdata(movies, genre2, rating2);

				System.out.println("\n 1 - Main Menu \n 2 - Exit");
				String Choicex = key.readLine();
				if(Choicex.equals("1")) {
					Thread.sleep(300);
					clearScreen();
					exit = true;	
				} else if(Choicex.equals("2")) {
					clearScreen();
					System.out.println("Thank you for visiting!");
					exit = false;
				}

			} else if(Choice.equals("4")) {
				System.out.println("Summary Information");
				System.out.println("Total movies: " + movies.length);
				System.out.println("Max total gross" + Summary.MaxValue(movies));
				System.out.println("Min total gross" + Summary.MinValue(movies));
				System.out.println("Average total gross" + Summary.Average(movies));
				System.out.println("Median total gross" + Sort.Median(movies));

				System.out.println("\n 1 - Main Menu \n 2 - Exit");
				String Choicex = key.readLine();
				if(Choicex.equals("1")) {
					Thread.sleep(300);
					clearScreen();
					exit = true;	
				} else if(Choicex.equals("2")) {
					clearScreen();
					System.out.println("Thank you for visiting!");
					exit = false;
				}

			} else if(Choice.equals("5")) {
				System.out.println("Would you like the data sorted \n 1 - low to high or 2 - high to low: ");
				System.out.println("Your choice: ");
				String Choicey = key.readLine();

				if(Choicey.equals("1")) {
					Sort.sortMin(movies);
				} else if(Choicey.equals("2")) {
					Sort.sortMax(movies);
				}

				System.out.println("\n 1 - Main Menu \n 2 - Exit");
				String Choicex = key.readLine();
				if(Choicex.equals("1")) {
					Thread.sleep(300);
					clearScreen();
					exit = true;	
				} else if(Choicex.equals("2")) {
					clearScreen();
					System.out.println("Thank you for visiting!");
					exit = false;
				}

			} else if(Choice.equals("7")) {
				System.out.println("Which chart do you want to see \n 1 - Pie Chart \n 2 - Blank Chart \n 3 - Tableview");
				System.out.println("Your choice: ");
				String Choicey = key.readLine();

				if(Choicey.equals("1")) {
					primaryStage.setScene(new Scene(PieChartApp.));
				}

				
			}
		

		}


		
		


	}

}