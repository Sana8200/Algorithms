
public class DynamicStack extends abstractStack {

    static final int MIN_SIZE = 4;   // Minimum size of the stack


    public DynamicStack() {
        super(8);
    }

    @Override
    public void push(int val) {
        if(top == size) {
            resize(size * 2); // Double the size if the stack is full
        }
        stack[top++] = val;
    }

    @Override
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        int val = stack[--top];

        // If the stack is one-quarter full and not below the minimum size, halve its size
        //top>0 ensure that stack isn't empty
        //top == size / 4 check if the stack is one-quarter full
        //size > MIN_SIZE ensure the stack size will not fall below the minimum size after resizing
        if(top > 0 && top == size / 4 && size / 2 >= MIN_SIZE ) {
            resize(size / 2); // Halve the size if the stack is one-quarter full
        }
        return val;
    }



    public void resize(int newSize) {
        if (newSize < MIN_SIZE) {
            newSize = MIN_SIZE;  // Ensure size doesn't go below MIN_SIZE
        }
        int[] newStack = new int[newSize];
        for(int i = 0; i < top; i++) {
            newStack[i] = stack[i];
        }
        size = newSize;
        stack = newStack;
    }


/*
    public int peek(){
        if(top == 0) {
            throw new RuntimeException("Stack.Stack is empty");
        }
        return stack[top - 1];
    }



    public void printStack() {
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + " ");
        }
    System.out.println();
    }

    public int size() {
        return top;
    }



    public static void main(String[] args) {
        DynamicStack<Number> stack = new DynamicStack<Number>();


        for(int i = 1; i <= 8; i++) {
            stack.push(i);
    }
        System.out.println("Pushing 8 items to a stack with size of 8:");
        stack.printStack();
        System.out.println(stack.size());


        for(int i = 9 ; i <= 16; i++) {
            stack.push(i);
        }
        System.out.println("Pushing 8 more items to a stack and increasing the size from 8 to 16:");
        stack.printStack();
        System.out.println(stack.size());


        for(int i = 9 ; i <= 16; i++) {
            stack.pop();
        }
        System.out.println("Poping 8 items in a stack and reducing the size from 16 to 8:");
        stack.printStack();
        System.out.println(stack.size());


        for(int i = 1 ; i <= 8; i++) {
            stack.pop();
        }
        System.out.println("Poping more items in a stack to reach minimum size of the stack:");
        stack.printStack();
        System.out.println(stack.size());

        if(stack.size() < MIN_SIZE){
            throw new IllegalStateException("Stack.Stack cannot be smaller than 4.");
        }
    }
 */
}
