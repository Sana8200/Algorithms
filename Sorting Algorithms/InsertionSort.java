import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void insertionSort(int[] array){
        for(int i = 1 ; i < array.length ; i++){
            for(int j = i  ; j > 0 && array[j] < array[j - 1] ; j--){
                swap(array, j, j - 1);
            }
        }
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    // An example main method to check the insertion sort and see the result for each case
    /*
    public static void main(String[] args) {
        int[] array = {6, 0, 2, 45, 4};
        insertionSort(array);
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        benchmark();

        int[] bestCase = {1, 2, 3, 4, 5}; // Best case (already sorted)
        int[] partiallySorted = {1, 2, 3, 5, 4}; // Partially sorted
        int[] worstCase = {5, 4, 3, 2, 1}; // Worst case (reverse sorted)
        int[] largeFewSorted = {8, 7, 6, 5, 1, 2, 3, 4}; // Few sorted elements

        // Benchmarking best case
        long startTime = System.nanoTime();
        insertionSort(bestCase);
        long endTime = System.nanoTime();
        System.out.println("Best case sorted: " + Arrays.toString(bestCase));
        System.out.println("Best case time: " + (endTime - startTime) + " ns");

        // Benchmarking partially sorted case
        startTime = System.nanoTime();
        insertionSort(partiallySorted);
        endTime = System.nanoTime();
        System.out.println("Partially sorted case: " + Arrays.toString(partiallySorted));
        System.out.println("Partially sorted case time: " + (endTime - startTime) + " ns");

        // Benchmarking worst case
        startTime = System.nanoTime();
        insertionSort(worstCase);
        endTime = System.nanoTime();
        System.out.println("Worst case sorted: " + Arrays.toString(worstCase));
        System.out.println("Worst case time: " + (endTime - startTime) + " ns");

        // Benchmarking large few sorted case
        startTime = System.nanoTime();
        insertionSort(largeFewSorted);
        endTime = System.nanoTime();
        System.out.println("Large few sorted case: " + Arrays.toString(largeFewSorted));
        System.out.println("Large few sorted case time: " + (endTime - startTime) + " ns");
    }

    public static void benchmark(){
        int[] sizes = {1000, 2000, 4000, 8000, 16000, 32000};
        Random random = new Random();

        System.out.printf("%-15s%-15s\n", "Array Size", "Time (milliseconds)");
        System.out.println("-------------------------------");

        for(int size : sizes){
            int[] array = new int[size];
            for(int i = 0 ; i < array.length ; i++){
                array[i] = random.nextInt(100000);
            }
            long startTime = System.currentTimeMillis();
            insertionSort(array);
            long endTime = System.currentTimeMillis();

            long totalTime = endTime - startTime;

            System.out.printf("%-15d%-15d\n", size, totalTime);
        }
    }

    public static void benchmarkInsertionSort(int[] array) {
        long startTime = System.currentTimeMillis();
        insertionSort(array);
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);

        System.out.println("Sorted Array (Benchmark):");
        printArray(array);
        System.out.println("Time taken (in milliseconds): " + duration);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

     */
}

