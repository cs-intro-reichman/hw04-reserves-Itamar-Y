public class ArrayOps {
    public static void main(String[] args) {

        int[] array1 = {0, 1, 2, 3, 4, 6}; // for testing
        int[] array2 =  {1,-2,3,-4,5}; // for testing
        System.out.println(array1);

        System.out.println(findMissingInt(array1));

        System.out.println(secondMaxValue(array2));

        int[] arrtest1 = {2, 2, 4, 7, 8, 3, 2}; // for testing
        int[] arrtest2 = {8, 2, 7, 7, 3}; // for testing
        System.out.println(containsTheSameElements(arrtest1, arrtest2));

        int[] array4 = {3, 2, 1}; // for testing
        System.out.println(isSorted(array4));

    }
    
    public static int findMissingInt (int [] array) {
        int missing = 0;
        int actualsum =0;
        int expectedsum =0;
       
        for (int i = 0; i < array.length; i++) {
            actualsum = actualsum + array[i];
            } 
            for (int j = 0; j <= array.length; j++)
            expectedsum += j;
         
        missing =  expectedsum - actualsum;

        return missing;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int smax = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } }
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++){
                if (array[j] == max && array[j] == array[i] && j != i ) {
                    smax = array[j];
                } else {
                    if (array[j] > smax && array[j] != max) {
                        smax = array[j];

                }
            }}}
            
        // for (int i = 0; i < array.length; i++) {
        //     if (array[i] > max) {
        //         smax = max; // Update second max to previous max
        //         max = array[i];
        //     } else if (array[i] > smax && array[i] != max) {
        //         smax = array[i];
        //     }
        // }
            return smax;
        }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {

    for (int i : array1) {
        boolean found = false;
        for (int j : array2) {
            if (i == j) {
                found = true;
                break;
            }
        }
        if (!found) {
            return false;
        }
    }
    for (int i : array2) {
        boolean found = false;
        for (int j : array1) {
            if (i == j) {
                found = true;
                break;
            }
        }
        if (!found) {
            return false; 
        }
    }

    return true; 
}

            
    public static boolean isSorted (int [] array) {
        boolean sorted = true;
        int n = array.length;
        if (array[0] > array[n-1]) {
            for (int i = 0; i < n-1; i++){
                if (array[i] < array[i+1]) {
                    sorted = false;
                    break;
            } }
        }
        if (array[0] < array[n-1]) {
        for (int i = 0; i < n-1; i++){
            if (array[i] > array[i+1]) {
                sorted = false;
                break;
        } } }
        if (array[0] == array[n-1]) {
          sorted = false;
            } 
        
        return sorted;
    } 
}
