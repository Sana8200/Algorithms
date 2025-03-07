import java.util.Random;

public class UnsortedSearch {
    public static boolean unsorted_search(int[] array, int key) {
        for (int index = 0; index < array.length; index++) {    //linear search
            if (array[index] == key) {
                return true;
            }
        }
        return false;
    }



    // An example main method to test the sorted search algorithm and compare the results and check the time complexity
    /*
    public static void main(String[] args) {
        int[] sizes = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000, 100000, 1000000};
        Random random = new Random();
        long[] averageTimes = new long[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            long totalTime = 0;

            for (int j = 0; j < 10; j++) {
                int[] numbers = new int[size];
                for (int k = 0; k < numbers.length; k++) { // Filling the array with random numbers
                    numbers[k] = random.nextInt();
                }
                int key = -1; // Key not in the array, worst case scenario

                long startTime = System.nanoTime();
                unsorted_search(numbers, key);
                long endTime = System.nanoTime();
                totalTime += (endTime - startTime);
            }
            averageTimes[i] = totalTime / 10;
        }


        System.out.printf("%-10s %-20s %-10s%n", "Array Size", "\tAverage Time (ns)", "  Ratio");

        for (int i = 0; i < sizes.length; i++) {
            if (i == 0) {
                // For the first entry, there's no previous size, so no ratio
                System.out.printf("%-10d   %-20d   %-10s%n", sizes[i], averageTimes[i], "-");
            } else {
                double ratio = (double) averageTimes[i] / averageTimes[i - 1];
                System.out.printf("%-10d   %-20d  %-10.2f%n", sizes[i], averageTimes[i], ratio);
            }
        }
    }

     */
}

