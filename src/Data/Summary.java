package Data;

public class Summary {

    public static Long MaxValue(Movies[] array) {
        
        Long maxValue = (long) array[1].getTotalgross();

        for(int i = 0; i < array.length; i++) {
            //maxValue = (long) array[i].getTotalgross();
            if(array[i].getTotalgross() > maxValue) {
                maxValue = (long) array[i].getTotalgross();
            }
        }

        return maxValue;
    }

    public static int MinValue(Movies[] array) {
        int minValue = array[1].getTotalgross();

        for(int i = 0; i < array.length; i++) {
            //minValue = array[i].getTotalgross();
            if(array[i].getTotalgross() < minValue) {
                minValue = array[i].getTotalgross();
            }
        }

        return minValue;
    }

    public static Long Average(Movies[] array) {
        int sum = 0;
        double average = 0;
        Long finalaverage;

        for(int i = 0; i < array.length; i++) {
            //sum = array.[i].getTotalgross();
            average = average + array[i].getTotalgross();
        }
        average = (average/array.length);
        finalaverage  = (long) average;
        return finalaverage;
    }

    public static double Avggenre(Movies[] array, String genrekey) {
        String genretype;
        int count = 0;
        double average = 0;

        for(int i = 0; i < array.length; i++) {
            genretype = array[i].getGenre();

            if(genretype.equals(genrekey)) {
                count++;
                average = average + array[i].getTotalgross();
            }
        }

        if(count == 0) {
            count = 1;
        }

        average = Math.round((average/count) * 100.0) / 100.0;
        return average;
    }

    public static double Avgrate(Movies[] array, String ratekey) {
        String ratetype;
        int count = 0;
        double average = 0;

        for(int i = 0; i < array.length; i++) {
            ratetype = array[i].getRating();

            if(ratetype.equals(ratekey)) {
                count++;
                average = average + array[i].getTotalgross();
            }
        }

        if(count == 0) {
            count = 1;
        }

        average = Math.round((average/count) * 100.0) / 100.0;
        return average;
    }

    public static double Avgrategenre(Movies[] array, String genrekey, String ratekey) {
        String genretype;
        String ratetype;
        int count = 0;
        double average = 0;

        for(int i = 0; i < array.length; i++) {
            genretype = array[i].getGenre();
            ratetype = array[i].getRating();

            if(genretype.equals(genrekey) && ratetype.equals(ratekey)) {
                count++;
                average = average + array[i].getTotalgross();
            }
        }

        if(count == 0) {
            count = 1;
        }

        average = Math.round((average/count) * 100.0) / 100.0;
        return average; 
    
    }

    public static Long standardDeviation(Movies[] array) {
        int sum = 0;
        double average;
        double sum2 = 0;
        double sum3 = 0;
        double answer;
        Long finalanswer;

        // Mean
        for(int i = 0; i < array.length; i++) {
            //sum = array.[i].getTotalgross();
            sum = sum + array[i].getTotalgross();
        }
        average = Math.round((sum/array.length) * 100.0) / 100.0;

        for (int i = 0; i < array.length; i++) {
            sum2 = Math.pow((array[i].getTotalgross() - average), 2);
            sum3 = sum3 + sum2;
        }

        answer = Math.round(Math.sqrt((sum3/array.length)) * 100.0) / 100.0;
        finalanswer = (long) answer;
        return finalanswer;
    }

    public static int countGenre(Movies[] array, String genrekey) {
        String element;
        int Count = 0;

        for(int i = 0; i < array.length; i++) {

            element = array[i].getGenre();

            if(element.equals(genrekey)) {
                Count++;
            }
        }

        return Count;
    }
    
}
