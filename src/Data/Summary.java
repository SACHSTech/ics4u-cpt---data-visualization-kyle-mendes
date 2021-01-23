package Data;

public class Summary {

    public static String MaxValue(Movies[] array) {
        int maxValue = 0;

        for(int i = 1; i < array.length; i++) {
            //maxValue = array[i].getTotalgross();
            if(array[i].getTotalgross() > maxValue) {
                maxValue = array[i].getTotalgross();
            }
        }

        return array[i].toString();
    }

    public static String MinValue(Movies[] array) {
        int minValue = 0;

        for(int i = 0; i < array.length; i++) {
            //minValue = array[i].getTotalgross();
            if(array[i].getTotalgross() < minValue) {
                minValue = array[i].getTotalgross();
            }
        }

        return array[i].toString();
    }

    public static String Average(Movies[] array) {
        int sum = 0;
        double average;

        for(int i = 0; i < array.length; i++) {
            //sum = array.[i].getTotalgross();
            sum = sum + array[i].getTotalgross();
        }
        average = sum/array.length;
        return "The total gross average is: " + average;
    }

    public static String Median(Movies[] array) {
        double number = array.length;
        int i;

        if(number % 2 == 0) {
            number = number / 2;
            i = (int)number;
            //System.out.println("The median is : " + array[i].toString());
        } else {
            number = Math.round(number / 2);
            i = (int)number;
            //System.out.println("The median is : " + array[i].toString());
        }
    }
   return ("The median is : " + array[i].toString());
    
}
