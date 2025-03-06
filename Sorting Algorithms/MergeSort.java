import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void sort(int[] org) {
        if (org.length == 0) {
            return;  // If array is empty, nothing to sort
        }
        int[] aux = new int[org.length];  // Create auxiliary array for temporary storage
        sort(org, aux, 0, org.length - 1);  // Start recursive sorting
    }

    public static void sort(int[] org, int[] aux, int lo, int hi){
        if(lo >= hi){
            return;
        }
        if(lo != hi){
            int mid = (lo + hi) / 2;

            //sort the items from lo to mid
            sort(org, aux, lo, mid);

            //sort the itmes from mid+1 to hi
            sort(org, aux, mid + 1, hi);

            //merge the two sections using the additional array
            merge(org, aux, lo, mid, hi);
        }
    }

    private static void merge(int[] org, int[] aux, int lo, int mid, int hi){
        //copy all items from lo to hi from org to aux
        for(int k = lo; k <= hi ; k++){
            aux[k] = org[k];
        }

        int i = lo;         //index in the first part
        int j = mid + 1;    //index in the second part

        for(int k = lo; k <= hi; k++){
            if(i > mid){
                //move the j'th item to the org array, update j
                org[k] = aux[j++];
            } else if(j > hi) {
                //move the i'th item to the org array, update i
                org[k] = aux[i++];
            } else if(aux[i] <= aux[j]) {  //if i'th items is smaller than the j'th items
                //move the i'th item to the org array, update i
                org[k] = aux[i++];
            } else
                //move the i'th item to the org array, update j
                org[k] = aux[j++];
        }

    }



    //An example main method to test the merge sort and benchmark and compare the results
    /*
    public static void main(String[] args){
        int[] array = {2, 5, 6, 9, 1, 3, 7, 8};
        sort(array);
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        benchmark();
    }

    public static void benchmark() {
        int[] sizes = {1000, 2000, 4000, 8000, 16000, 32000};
        Random random = new Random();

        System.out.printf("%-15s%-15s\n", "Array Size", "Time (milliseconds)");
        System.out.println("-------------------------------");

        for (int size : sizes) {
            int[] array = new int[size];

            // Fill array with random numbers
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100000);
            }

            long startTime = System.nanoTime();
            sort(array);
            long endTime = System.nanoTime();

            long totalTime = endTime - startTime;

            System.out.printf("%-15d%-15d\n", size, totalTime);
        }
    }

     */
}

