package Data;

public class Summary {

    public static int MaxValue(Movies[] array) {
        
        int maxValue = 0;

        for(int i = 1; i < array.length; i++) {
            maxValue = array[i].getTotalgross();
            if(array[i].getTotalgross() > maxValue) {
                maxValue = array[i].getTotalgross();
            }
        }

        return maxValue;
    }

    public static int MinValue(Movies[] array) {
        int minValue = 0;

        for(int i = 0; i < array.length; i++) {
            minValue = array[i].getTotalgross();
            if(array[i].getTotalgross() < minValue) {
                minValue = array[i].getTotalgross();
            }
        }

        return minValue;
    }

    public static double Average(Movies[] array) {
        int sum = 0;
        double average;

        for(int i = 0; i < array.length; i++) {
            //sum = array.[i].getTotalgross();
            sum = sum + array[i].getTotalgross();
        }
        average = Math.round((sum/array.length) * 100.0) / 100.0;
        return average;
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
    
}
