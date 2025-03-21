import java.util.Arrays;

public class Array {
    private int[] array;
    private int size; // Current number of elements

    public Array() {
        array = new int[2]; // Start with a small array
        size = 0;
    }

    public void append(int value) {
        if (size == array.length) {
            resize(); // Resize the array if it's full
        }
        array[size] = value; // Append the new element
        size++; // Increment the size
    }

    private void resize() {
        int newSize = array.length * 2; // Double the size
        array = Arrays.copyOf(array, newSize); // Create a new array and copy elements
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array dynamicArray = new Array();

        // Benchmarking the append operation
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            dynamicArray.append(i);
        }
        long endTime = System.nanoTime();

        // Print the final array
        dynamicArray.print();

        // Print benchmark results
        System.out.println("Time taken to append 10,000 elements: " + (endTime - startTime) + " ns");
    }
}
