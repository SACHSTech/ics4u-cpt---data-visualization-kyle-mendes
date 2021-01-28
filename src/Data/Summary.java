package Data;

public class Summary {

    /**
    * Gets the max total gross of the data set 
    * @param array - the movie array 
    * @return the max total gross
    */
    public static Long MaxValue(Movies[] array) {
        
        Long maxValue = (long) array[1].getTotalgross();

        for (int i = 0; i < array.length; i++) {
            if (array[i].getTotalgross() > maxValue) {
                maxValue = (long) array[i].getTotalgross();
            }
        }

        return maxValue;
    }

    /**
    * Gets the min total gross of the data set 
    * @param array - the movie array 
    * @return the min total gross
    */
    public static int MinValue(Movies[] array) {
        int minValue = array[1].getTotalgross();

        for (int i = 0; i < array.length; i++) {
            if (array[i].getTotalgross() < minValue) {
                minValue = array[i].getTotalgross();
            }
        }

        return minValue;
    }

    /**
    * Gets the average total gross of the data set 
    * @param array - the movie array 
    * @return the average total gross
    */
    public static Long Average(Movies[] array) {

        // Initialize the variables
        double average = 0;
        Long finalaverage;

        for (int i = 0; i < array.length; i++) {
            average = average + array[i].getTotalgross();
        }

        // Calculate the average and convert is to long
        average = (average/array.length);
        finalaverage  = (long) average;
        return finalaverage;
    }

    /**
    * Gets the average total gross based on specific genre in the data set 
    * @param array - the movie array 
    * @return the averagegenre total gross
    */
    public static double Avggenre(Movies[] array, String genrekey) {

        // Initialize the variables
        String genretype;
        int count = 0;
        double average = 0;

        // Go through the array
        for (int i = 0; i < array.length; i++) {
            genretype = array[i].getGenre();

            // Check if the genres are the same
            if (genretype.equals(genrekey)) {
                count++;
                average = average + array[i].getTotalgross();
            }
        }

        if (count == 0) {
            count = 1;
        }

        // Calculate the average
        average = Math.round((average/count) * 100.0) / 100.0;
        return average;
    }

    /**
    * Gets the average total gross based on specific mpa rating in the data set 
    * @param array - the movie array 
    * @return the average mpa rating total gross
    */
    public static double Avgrate(Movies[] array, String ratekey) {

        // Initalialize the variables
        String ratetype;
        int count = 0;
        double average = 0;

        // Go through array
        for (int i = 0; i < array.length; i++) {
            ratetype = array[i].getRating();

            // Check is the rates are the same
            if (ratetype.equals(ratekey)) {
                count++;
                average = average + array[i].getTotalgross();
            }
        }

        if (count == 0) {
            count = 1;
        }

        // Calculate the average
        average = Math.round((average/count) * 100.0) / 100.0;
        return average;
    }

    /**
    * Gets the average total gross based on specific genre and mpa rating of the data set 
    * @param array - the movie array 
    * @return the average genre and mpa rating total gross
    */
    public static double Avgrategenre(Movies[] array, String genrekey, String ratekey) {
        
        // Initialize the variables
        String genretype;
        String ratetype;
        int count = 0;
        double average = 0;

        // Go through the array
        for (int i = 0; i < array.length; i++) {
            genretype = array[i].getGenre();
            ratetype = array[i].getRating();

            // Check to see if genre and rate match
            if (genretype.equals(genrekey) && ratetype.equals(ratekey)) {
                count++;
                average = average + array[i].getTotalgross();
            }
        }

        if (count == 0) {
            count = 1;
        }

        // Calculate the average
        average = Math.round((average/count) * 100.0) / 100.0;
        return average; 
    
    }

    /**
    * Gets the standard deviation of the total gross in the data set 
    * @param array - the movie array 
    * @return the standard deviation of total gross
    */
    public static Long standardDeviation(Movies[] array) {

        // Initialize the variables
        int sum = 0;
        double average;
        double sum2 = 0;
        double sum3 = 0;
        double answer;
        Long finalanswer;

        // Calculate the mean
        for (int i = 0; i < array.length; i++) {
            //sum = array.[i].getTotalgross();
            sum = sum + array[i].getTotalgross();
        }
        average = Math.round((sum/array.length) * 100.0) / 100.0;

        // Subtract the Mean and square the result
        for (int i = 0; i < array.length; i++) {
            sum2 = Math.pow((array[i].getTotalgross() - average), 2);
            sum3 = sum3 + sum2;
        }

        // Workout the mean of the differences and square root the total
        answer = Math.round(Math.sqrt((sum3/array.length)) * 100.0) / 100.0;
        finalanswer = (long) answer;
        return finalanswer;
    }

    /**
    * Counts how many movies are the chosen genre data set 
    * @param array - the movie array 
    * @return the number of times a genre appears
    */
    public static int countGenre(Movies[] array, String genrekey) {

        // Initialize the variables
        String element;
        int Count = 0;

        // Go through the array
        for (int i = 0; i < array.length; i++) {
            element = array[i].getGenre();

            // Count how many times the genre key appears
            if(element.equals(genrekey)) {
                Count++;
            }
        }
        return Count;
    }
    
}
