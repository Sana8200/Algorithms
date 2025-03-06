import java.util.Random;

public class OptimizedMergeSort {

    public static void sort(int[] org){
        if(org.length == 0){
            return;
        }

        int[] aux = new int[org.length];
        for(int i = 0; i < org.length ; i++){
            aux[i] = org[i];
        }
        sort(aux, org, 0, org.length - 1);
    }


    public static void sort(int[] org, int[] aux, int lo, int hi){
        if(lo >= hi){
            return;
        }

        int mid = (hi + lo) / 2;

        sort(aux, org, lo, mid);
        sort(aux, org, mid + 1, hi);

        merge(org, aux, lo, mid, hi);
    }

    public static void merge(int[] org, int[] aux, int lo, int mid, int hi){
        int i = lo;
        int j = mid + 1;

        for(int k = lo; k <= hi; k++){
            if(i > mid){
                aux[k] = org[j++];
            } else if( j > hi){
                aux[k] = org[i++];
            } else if(org[i] <= org[j]){
                aux[k] = org[i++];
            } else {
                aux[k] = org[j++];
            }
        }
    }



    //An exmple main method to test the optimized merge sort and compare the results with other sorting algorithms using benchmark
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

