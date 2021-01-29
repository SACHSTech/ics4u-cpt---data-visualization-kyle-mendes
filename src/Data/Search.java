package Data;

// import items i need
import java.util.ArrayList;

public class Search {
    
    /**
    * Search for the movie name in the dataset
    * @param array - the movie array 
    * @param key - the name of the movie
    * @return the array list with the movie  
    */
    public static ArrayList<Movies> nameSearch(Movies[] array, String key) {
        String element;

        // Create array list
        ArrayList<Movies> matching = new ArrayList<Movies>();

        // Check the data
        for(int i = 0; i < array.length; i++) {
            element = array[i].getName();

            if(element.equals(key)) {
                matching.add(array[i]);
            }
        }

        return matching;
    }

    /**
    * Search for the movie date in the dataset
    * @param array - the movie array 
    * @param key - the date of the movie
    * @return a line  
    */
    public static String dateSearch(Movies[] array, String key) {
        String element;

        // Check whole data set
        for(int i = 0; i < array.length; i++) {

            element = array[i].getDate();

            if(element.equals(key)) {
                System.out.println(array[i].toString());
            }
        }

        return " ";
    }

    /**
    * Search for the movie genre in the dataset
    * @param array - the movie array 
    * @param key - the genre of the movie
    * @return a line  
    */
    public static String genreSearch(Movies[] array, String key) {
        String element;

        // Check whole data set
        for(int i = 0; i < array.length; i++) {

            element = array[i].getGenre();

            if(element.equals(key)) {
                System.out.println(array[i].toString());
            }
        }

        return " ";
    }

    /**
    * Search for the movie mpa rating in the dataset
    * @param array - the movie array 
    * @param key - the mpa rating of the movie
    * @return a line  
    */
    public static String ratingSearch(Movies[] array, String key) {
        String element;

        // Check whole data set
        for(int i = 0; i < array.length; i++) {

            element = array[i].getRating();

            if(element.equals(key)) {
                System.out.println(array[i].toString());
            }
        }

        return " ";
    }

    /**
    * Search for the movie total gross in the dataset
    * @param array - the movie array 
    * @param key - the total gross of the movie
    * @return the array list with the movies  
    */
    public static ArrayList<Movies> totalgrossSearch(Movies[] array, int key) {
        int element;

        // Create array list
        ArrayList<Movies> matching = new ArrayList<Movies>();

        // Check whole data set
        for(int i = 0; i < array.length; i++) {
            element = array[i].getTotalgross();

            if(element == (key)) {
                matching.add(array[i]);
            }
        }

        return matching;
    }

    /**
    * Search for the movie adjusted gross in the dataset
    * @param array - the movie array 
    * @param key - the adjusted gross of the movie
    * @return a line  
    */
    public static String adjustedgrossSearch(Movies[] array, Long key) {
        Long element;

        // Check whole data set
        for(int i = 0; i < array.length; i++) {

            element = array[i].getAdjustedgross();

            if(element.equals(key)) {
                System.out.println(array[i].toString());
            }
        }

        return " ";
    }

    /**
    * Searchs for an individual movie
    * @param array - the movie array 
    * @param name - the movie name
    * @param date - the date 
    * @param rating - the mpa rating
    * @param genre - the genre
    * @param totalgross - total gross
    * @param adjustedgross - the adjusted gross
    * @return a line
    */
    public static String individualSearch(Movies[] array, String name, String date, String genre, String rating, int totalgross, Long adjustedgross) {
        String thename;
        String thedate;
        String thegenre;
        String therating;
        int thetotalgross;
        Long theadjustedgross;

        // Check whole data set
        for(int i = 0; i < array.length; i++) {
            thename = array[i].getName();
            thedate = array[i].getDate();
            thegenre = array[i].getGenre();
            therating = array[i].getRating();
            thetotalgross = array[i].getTotalgross();
            theadjustedgross = array[i].getAdjustedgross();

            if(thename.equals(name) && thedate.equals(date) && thegenre.equals(genre) && therating.equals(rating) && (thetotalgross == totalgross) && (theadjustedgross.equals(adjustedgross))) {
                System.out.println(array[i].toString());
            } 
        }

        return " "; 

    } 

    /**
    * Searchs for movies that have specific filters
    * @param array - the movie array 
    * @param key - the genre
    * @param rating - the mpa rating
    * @return a line  
    */
    public static String Filterdata(Movies[] array, String genre, String rating) {
        String thegenre;
        String therating;

        // Check whole data set
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
