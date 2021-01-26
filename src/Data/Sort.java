package Data;

public class Sort {
    
    public static Movies[] sortMin(Movies[] array) {

        int currentMinIndex;

        for(int i = 0; i < array.length - 1; i++) {
            currentMinIndex = i;

            for(int j = i + 1; j < array.length; j++) {
                if(array[j].getTotalgross() < array[currentMinIndex].getTotalgross()) {
                    currentMinIndex = j;
                }
            }
            
            if(i != currentMinIndex) {
                Movies temp = array[currentMinIndex];
                array[currentMinIndex] = array[i];
                array[i] = temp;
            }
        }

        return array;

    }

    public static Movies[] sortMax(Movies[] array) {

        int currentMinIndex;

        for(int i = 0; i < array.length - 1; i++) {
            currentMinIndex = i;

            for(int j = i + 1; j < array.length; j++) {
                if(array[j].getTotalgross() > array[currentMinIndex].getTotalgross()) {
                    currentMinIndex = j;
                }
            }
            
            if(i != currentMinIndex) {
                Movies temp = array[currentMinIndex];
                array[currentMinIndex] = array[i];
                array[i] = temp;
            }

        }

        return array;
    }

    public static double Median(Movies[] array) {
        int number = array.length; 
        int ii;
        int i;
        double median;
        double gross;
        double gross2;

        sortMin(array);

        if(number % 2 == 0) {
            i = number / 2;
            ii = i + 1;

            gross = (array[i].getTotalgross());
            gross2 = (array[ii].getTotalgross());

            median = (gross + gross2) / 2;

        } else {
            number = Math.round(number / 2);
            i = (int)number;
            median = array[i].getTotalgross();
        }

        return median;
    }


}
