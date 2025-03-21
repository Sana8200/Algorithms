## Linked lists

### `LinkedList.java`
Linked lists are a linear data structure, where we have nodes as elements(or cells
in this assignment). Each cell contains data and a reference or pointer to the
next cell (or node) in the sequence. To implementing a linked list, We define a
LinkedList and add some useful methods.

### `Array.java`
Appending elements in arrays differs from linked lists due to fixed sizes and resizing constraints. Arrays require resizing when full, whereas linked lists grow dynamically without such limitations.

---

#### Stack and Linked Lists
Stacks can be implemented using linked lists instead of arrays. Each stack element consists of data and a reference to the next node, with the top of the stack pointing to the first node.

Pros:

✔ Dynamic resizing—no need to check or resize like arrays.

✔ Efficient memory allocation, using only what’s needed.

Cons:

✖ Extra memory required for storing references.

✖ Potential cache performance issues due to non-contiguous memory storage.



