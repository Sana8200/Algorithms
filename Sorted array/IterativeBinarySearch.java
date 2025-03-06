import java.util.Random;

public class IterativeBinarySearch {

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

    public static boolean binary_search(int[] array, int key){
        int first = 0;
        int last = array.length - 1;
        while (true) {
            int index = (first + last) / 2;
            if (array[index] == key) {
                return true;
            }
            if (array[index] < key && index < last) {
                first = index + 1 ;
                continue;
            }
            if (array[index] > key && index > first) {
                last = index - 1 ;
                continue;
            }
            return false;
        }
    }




    public static void main(String[] args) {
        int[] sizes = { 234234, 1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000, 100000, 1000000, 64000000};
        Random random = new Random();
        long[] averageTimes = new long[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            long totalTime = 0;

            // Run multiple iterations to get an average time
            for (int j = 0; j < 10; j++) {
                int[] numbers = sorted(size);
                int key = random.nextInt(size * 10); // Random key, can be in or out of the array

                long startTime = System.nanoTime();
                binary_search(numbers, key);
                long endTime = System.nanoTime();
                totalTime += (endTime - startTime);
            }

            averageTimes[i] = totalTime / 10; // Average time over 10 runs
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
}

