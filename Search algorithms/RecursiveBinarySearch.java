import java.util.Random;

public class RecursiveBinarySearch {
    private static boolean recursive(int[] arr, int key, int min, int max) {
        int mid = min + ((max - min)/2);
        if (arr[mid] == key) {
            return true;
        }
        if ((arr[mid] > key) && (min < mid)) {
            return recursive(arr, key, min, mid - 1);
        }
        if ((arr[mid] < key) && (mid < max)) {
            return recursive(arr, key, mid + 1, max);
        }
        return false;
    }

    private static int[] sorted(int n) {
        Random rnd = new Random();
        int[] array = new int[n];
        int nxt = 0;
        for (int i = 0; i < n; i++) {
            nxt += rnd.nextInt(10) + 1;
            array[i] = nxt;
        }
        return array;
    }





    // An example Main method to test the algorithm and check the time complexity
    /*
    public static void main(String[] args) {
        int[] sizes = {424342, 1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000, 100000, 1000000};
        Random random = new Random();
        long[] averageTimes = new long[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            long totalTime = 0;

            // Run multiple iterations to get an average time
            for (int j = 0; j < 100; j++) {
                int[] numbers = sorted(size);
                int key = random.nextInt(size * 100); // Random key, can be in or out of the array

                long startTime = System.nanoTime();
                recursive(numbers, key, 0, numbers.length - 1);
                long endTime = System.nanoTime();
                totalTime += (endTime - startTime);
            }

            averageTimes[i] = totalTime / 100; // Average time over 100 runs
        }

        // Output the results
        System.out.printf("%-10s %-20s %-10s%n", "Array Size", "Average Time (ns)", "Ratio");

        for (int i = 0; i < sizes.length; i++) {
            if (i == 0) {
                System.out.printf("%-10d   %-20d   %-10s%n", sizes[i], averageTimes[i], "-");
            } else {
                double ratio = (double) averageTimes[i] / averageTimes[i - 1];
                System.out.printf("%-10d   %-20d  %-10.2f%n", sizes[i], averageTimes[i], ratio);
            }
        }
    }
    */
}

