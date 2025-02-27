public class StaticStack extends abstractStack {

    public StaticStack(int size) {
        super(size);
    }

    @Override
    public void push(int val) {
        if (val == -1) {
            System.out.println("Value -1 cannot be added to the stack.");
            return;
        }
        if( top == stack.length - 1 ) {
            System.out.println("Stack is full.");
            return;
        }
        stack[top++] = val;
    }

   @Override
    public int pop() {
        if(top == -1) {
            System.out.println("Stack is empty") ;
            return -1;
        }
        return stack[--top];
    }
/*
    public static void main(String[] args) {
        StaticStack s = new StaticStack(16);
        s.push(32);
        s.push(33);
        s.push(34);

        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
    }
 */
}

