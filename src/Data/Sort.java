package Data;

public class Sort {

    /**
    * Sorts the data from lowest to highest total gross 
    * @param array - the movie array 
    * @return the sorted array
    */    
    public static Movies[] sortMin(Movies[] array) {

        // Initialize the variable
        int currentMinIndex;

        // Start the sorting
        for (int i = 0; i < array.length - 1; i++) {
            currentMinIndex = i;

            // Find the index of the min of the unsorted list
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].getTotalgross() < array[currentMinIndex].getTotalgross()) {
                    currentMinIndex = j;
                }
            }
            
            // Swap numbers if needed
            if (i != currentMinIndex) {
                Movies temp = array[currentMinIndex];
                array[currentMinIndex] = array[i];
                array[i] = temp;
            }
        }

        return array;

    }

    /**
    * Sorts the data from highest to lowest total gross 
    * @param array - the movie array 
    * @return the sorted array
    */
    public static Movies[] sortMax(Movies[] array) {

        // Initialize the variable
        int currentMinIndex;

        // Find the index of the max of the unsorted list
        for (int i = 0; i < array.length - 1; i++) {
            currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j].getTotalgross() > array[currentMinIndex].getTotalgross()) {
                    currentMinIndex = j;
                }
            }
            
            // Swap numbers if needed
            if (i != currentMinIndex) {
                Movies temp = array[currentMinIndex];
                array[currentMinIndex] = array[i];
                array[i] = temp;
            }

        }

        return array;
    }

    /**
    * Gets the median total gross of the data set 
    * @param array - the movie array 
    * @return the median total gross
    */
    public static Long Median(Movies[] array) {

        // Initialize the variable
        int number = array.length; 
        int ii;
        int i;
        double median;
        double gross;
        double gross2;
        Long finalmedian;

        // Sorts the array
        sortMin(array);

        // Check if number is even or odd
        if (number % 2 == 0) {
            i = number / 2;
            ii = i + 1;

            gross = (array[i].getTotalgross());
            gross2 = (array[ii].getTotalgross());

            median = (gross + gross2) / 2;
        } 
        
        else {
            number = Math.round(number / 2);
            i = (int)number;
            median = array[i].getTotalgross();
        }

        // Convert int to long
        finalmedian = (long) median;

        return finalmedian;
    }

}
