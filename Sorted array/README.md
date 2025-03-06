## Search Algorithms: The Advantage of Sorted Data

This repository contains implementations of different search algorithms for arrays, demonstrating the efficiency of searching in sorted versus unsorted data. The repository includes the following search methods:

- Linear Search (Unsorted Search)

- Iterative Binary Search (Sorted Search)

- Recursive Binary Search (Sorted Search)

The project also benchmarks the performance of these algorithms on various array sizes, providing insights into their time complexity and suitability for large data sets.

--- 

### 1. Linear Search (Unsorted Search)

The linear search algorithm is a straightforward method for searching in unsorted arrays. It scans each element sequentially until it finds the target or reaches the end of the array. While simple, it has a time complexity of O(n), making it inefficient for large data sets.

- Best Case: O(1) (First element is the target)

- Worst Case: O(n) (Target is not present or is the last element)

- Average Case: O(n)

---

### 2. Iterative Binary Search (Sorted Search)

The iterative binary search is a highly efficient method for searching sorted arrays. It uses a loop to repeatedly divide the search interval in half, significantly reducing the number of comparisons needed. It offers a time complexity of O(log n), making it ideal for large data sets.

- Best Case: O(1) (Middle element is the target)

- Worst Case: O(log n)

- Average Case: O(log n)

---

### 3. Recursive Binary Search (Sorted Search)

The recursive binary search works similarly to the iterative method but uses recursion to manage the search intervals. While offering the same time complexity of O(log n), it has a higher space complexity of O(log n) due to the call stack.

- Pros: Clean and readable code, efficient for moderately sized arrays

- Cons: Risk of stack overflow with extremely large data sets
