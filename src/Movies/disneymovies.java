package Movies;

import java.io.*;
import java.util.Scanner;

public class disneymovies {
    public static void main(String[] args) throws IOException {

        String line = ("");

        try {
            BufferedReader data = new BufferedReader(new FileReader("src/Movies/Disneymoviesgood.csv"));

            while((line = data.readLine()) != null) {
                String[] info = line.split(", ");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");

        /*
        Scanner list = new Scanner(new File("src/Movies/Disneymoviesgood.csv"));
        list.useDelimiter(", ");

        while (list.hasNext()) {
            System.out.println(list.next());
        }

        list.close();
        */
    }
}
/*
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
 
 
 

