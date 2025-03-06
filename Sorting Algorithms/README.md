## Sorting Algorithms: How to Sort Things

This project different sorting algorithms, demonstrating their efficiency and performance with different types of datasets. The assignment evaluates the time complexity, advantages, and disadvantages of each algorithm to determine the best approach for sorting arrays.

---

### 1. `SelectionSort.java`

Selection sort iterates through the array, selects the smallest element, and swaps it with the first unsorted element. This process continues until the array is fully sorted.

- Time Complexity: O(n²) for all cases

- Pros: Simple and easy to implement

- Cons: Inefficient on large datasets

### 2. `InsertionSort.java`

Insertion sort builds the sorted array one element at a time by comparing each new element with the sorted ones and inserting it in the correct position.

Time Complexity:

- Best Case: O(n) (Array is already sorted)

- Worst and Average Case: O(n²)

- Pros: Efficient for small or nearly sorted datasets

- Cons: Inefficient for large, unsorted datasets

### 3. `MergeSort.java`

Merge sort is a divide-and-conquer algorithm that recursively divides the array into halves, sorts them, and merges them back together.

- Time Complexity: O(n log n) for all cases

- Pros: Stable sorting, great for large datasets

- Cons: Requires additional memory (O(n) space complexity)

### 4. `OptimizedMergeSort.java`

This version of merge sort reduces unnecessary copying between the original array and auxiliary array during recursion, improving performance.

- Time Complexity: O(n log n)

- Pros: Faster execution by reducing overhead

- Cons: Still requires additional memory

### 5. `QuickSort.java`

Quick Sort uses a pivot element to partition the array into sub-arrays, which are then sorted recursively. It is an efficient, in-place sorting algorithm.

- Time Complexity:

- Best Case: O(n log n)

- Average Case: O(n log n)

- Worst Case: O(n²) (Occurs with poor pivot selection)

- Pros: Fast and uses minimal memory

- Cons: Not stable, performance can degrade with bad pivots

---

#### Conclusion

The choice of sorting algorithm depends on the size and nature of the dataset:

- Small or Nearly Sorted Arrays: Use Insertion Sort for its simplicity and speed.

- Large Arrays: Use Merge Sort, Optimized Merge Sort, or Quick Sort for their O(n log n) performance.

- For Simplicity: Selection Sort can work but is not recommended for large datasets.

Optimized Merge Sort and Quick Sort provide the best performance among the algorithms tested, particularly for large datasets, by minimizing memory operations and offering quick execution times.



[Assignment4_How_to_sort_things.pdf](https://github.com/user-attachments/files/19101382/Assignment4_How_to_sort_things.pdf)
