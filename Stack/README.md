# HP35 A calculator using Stack

A stack is a LIFO (Last-In, First-Out) data structure, implemented here with push() and pop() methods.

#### `abstractStack.java`
An abstract class with push() and pop() methods, initializing the stack with a fixed size. It tracks elements using an array, a size variable, and a top index (starting at 0).

#### `StaticStack.java`
A fixed-size stack that doesn’t grow dynamically. It prevents invalid values (-1) and ensures the stack doesn’t exceed its limit. If full, it prints “Stack is full.”

#### `DynamicStack.java`
A resizable stack that expands or shrinks as needed.
- Growing: If full, the size doubles to balance performance and memory use.
- Shrinking: If one-quarter full (but above the minimum size), it halves to optimize memory.
- Resizing: A resize() method copies elements into a new array with the updated size.


## `HP35.java`
A calculator using a DynamicStack to evaluate expressions in Reverse Polish Notation (RPN).
- It initializes a dynamic stack and processes input characters.
- Operators (+, -, *, /) pop two values, apply the operation, and push the result.
- It validates operations (e.g., preventing division by zero and ensuring enough values exist).
- Handles digits, spaces, and ensures invalid characters are rejected.


#### Result 
If we enter this mathematical expression in the terminal:
         `4 2 3 * 4 + 4 * + 2 -`
The result is 42.
