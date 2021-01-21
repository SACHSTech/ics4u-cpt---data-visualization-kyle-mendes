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
            
        }

        if(i != currentMinIndex) {
            Movies temp = array[currentMinIndex];
            array[currentMinIndex] = array[i];
            array[i] = temp;
        }
    }

    return array;

    public static Movies[] sortMax(Movies[] array) {

        int currentMinIndex;

        for(int i = 0; i < array.length - 1; i++) {
            currentMinIndex = i;

            for(int j = i + 1; j < array.length; j++) {
                if(array[j].getTotalgross() > array[currentMinIndex].getTotalgross()) {
                    currentMinIndex = j;
                }
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
