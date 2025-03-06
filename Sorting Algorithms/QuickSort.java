import java.util.Random;

public class QuickSort {
    private static void quickSort(int[] array, int lowIndex, int highIndex){
        if( lowIndex >= highIndex ){
            return;
        }
        int pivot = array[highIndex];

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(array, leftPointer,rightPointer);
        }
        swap(array, leftPointer, highIndex);
        return leftPointer;
    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }




    //An example main method to test the quick sort and check the benchmark results and compare
    /*
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};
        quickSort(array);
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
            quickSort(array, 0, array.length - 1);
            long endTime = System.nanoTime();

            long totalTime = endTime - startTime;

            System.out.printf("%-15d%-15d\n", size, totalTime);
        }
    }

     */
}

