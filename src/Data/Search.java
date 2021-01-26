package Data;
import java.util.ArrayList;

public class Search {
    
    public static String nameSearch(Movies[] array, String key) {
        String element;

        for(int i = 0; i < array.length; i++) {
            element = array[i].getName();
            if(element.equals(key)) {
                System.out.println("Here is the result: ");
                System.out.println(array[i].toString());
            }
        }

        return " ";
    }

    public static String dateSearch(Movies[] array, String key) {
        String element;

        for(int i = 0; i < array.length; i++) {
            element = array[i].getDate();
            if(element.equals(key)) {
                System.out.println("Here is the result: ");
                System.out.println(array[i].toString());
            }
        }

        return " ";
    }

    public static ArrayList<Movies> genreSearch(Movies[] array, String key) {
        String element;
        ArrayList<Movies> matching = new ArrayList<Movies>();

        for(int i = 0; i < array.length; i++) {
            element = array[i].getGenre();
            if(element.equals(key)) {
                matching.add(array[i]);
            }
        }

        return matching;
    }

    public static ArrayList<Movies> ratingSearch(Movies[] array, String key) {
        String element;
        ArrayList<Movies> matching = new ArrayList<Movies>();

        for(int i = 0; i < array.length; i++) {
            element = array[i].getRating();
            if(element.equals(key)) {
                matching.add(array[i]);
            }
        }

        return matching;
    }

    public static String totalgrossSearch(Movies[] array, int key) {
        int element;

        for(int i = 0; i < array.length; i++) {
            element = array[i].getTotalgross();
            if(element == key) {
                System.out.println(array[i].toString());
            }
        }

        return " ";
    }

    public static String adjustedgrossSearch(Movies[] array, int key) {
        int element;

        for(int i = 0; i < array.length; i++) {
            element = (int)array[i].getAdjustedgross();
            if(element == key) {
                System.out.println(array[i].toString());
            }
        }

        return " ";
    }

    public static String individualSearch(Movies[] array, String name, String date, String genre, String rating, int totalgross, long adjustedgross) {
        String thename;
        String thedate;
        String thegenre;
        String therating;
        int thetotalgross;
        long theadjustedgross;

        for(int i = 0; i < array.length; i++) {
            thename = array[i].getName();
            thedate = array[i].getDate();
            thegenre = array[i].getGenre();
            therating = array[i].getRating();
            thetotalgross = array[i].getTotalgross();
            theadjustedgross = array[i].getAdjustedgross();

            if(thename.equals(name) && thedate.equals(date) && thegenre.equals(genre) && therating.equals(rating) && (thetotalgross == totalgross) && (theadjustedgross == adjustedgross)) {
                System.out.println(array[i].toString());
            }
        }

        return "Invalid Entry"; 

    } 
}
