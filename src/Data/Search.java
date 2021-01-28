package Data;
import java.util.ArrayList;

public class Search {
    
    public static ArrayList<Movies> nameSearch(Movies[] array, String key) {
        String element;

        ArrayList<Movies> matching = new ArrayList<Movies>();

        for(int i = 0; i < array.length; i++) {
            element = array[i].getName();

            if(element.equals(key)) {
                matching.add(array[i]);
            }
        }

        return matching;
    }

    public static String dateSearch(Movies[] array, String key) {
        String element;

        for(int i = 0; i < array.length; i++) {

            element = array[i].getDate();

            if(element.equals(key)) {
                System.out.println(array[i].toString());
            }
        }

        return " ";
    }

    public static String genreSearch(Movies[] array, String key) {
        String element;

        for(int i = 0; i < array.length; i++) {

            element = array[i].getGenre();

            if(element.equals(key)) {
                System.out.println(array[i].toString());
            }
        }

        return " ";
    }

    public static String ratingSearch(Movies[] array, String key) {
        String element;

        for(int i = 0; i < array.length; i++) {

            element = array[i].getRating();

            if(element.equals(key)) {
                System.out.println(array[i].toString());
            }
        }

        return " ";
    }

    public static ArrayList<Movies> totalgrossSearch(Movies[] array, int key) {
        int element;

        ArrayList<Movies> matching = new ArrayList<Movies>();

        for(int i = 0; i < array.length; i++) {
            element = array[i].getTotalgross();

            if(element == (key)) {
                matching.add(array[i]);
            }
        }

        return matching;
    }

    public static String adjustedgrossSearch(Movies[] array, Long key) {
        Long element;

        for(int i = 0; i < array.length; i++) {

            element = array[i].getAdjustedgross();

            if(element.equals(key)) {
                System.out.println(array[i].toString());
            }
        }

        return " ";
    }

    public static String individualSearch(Movies[] array, String name, String date, String genre, String rating, int totalgross, Long adjustedgross) {
        String thename;
        String thedate;
        String thegenre;
        String therating;
        int thetotalgross;
        Long theadjustedgross;

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

        return "Invalid"; 

    } 

    public static String Filterdata(Movies[] array, String genre, String rating) {
        String thegenre;
        String therating;

        for(int i = 0; i < array.length; i++) {
            thegenre = array[i].getGenre();
            therating = array[i].getRating();

            if(thegenre.equals(genre) && therating.equals(rating)) {
                System.out.println(array[i].toString());
            }
        }

        return " ";
    }
}
