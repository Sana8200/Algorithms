import java.util.Random;

public class SelectionSort {
    //we search for the lowest element and arrange it to the proper location
    //we swap the current element with the next lowest number
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int candidate = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[candidate]) {
                    candidate = j;
                }
            }
            int temp = array[i];
            array[i] = array[candidate];
            array[candidate] = temp;
        }
    }



    //An example main method to test the selection sort and benchmark it, comparing the results with other sorting algorithms
    /*
    public static void main(String[] args) {
        int[] array = {6, 0, 2, 45, 4};
        selectionSort(array);
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        benchmark();
    }

    //benchmark
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
            selectionSort(array);
            long endTime = System.currentTimeMillis();

            long totalTime = endTime - startTime;

            System.out.printf("%-15d%-15d\n", size, totalTime);
        }
    }

     */
}
