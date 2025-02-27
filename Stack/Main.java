public class Main {
    public static void main(String[] args) {
        //Testing DynamicStack
        abstractStack dynamicStack = new DynamicStack();
        for (Integer i = 0; i < 3; i++) {
            dynamicStack.push(i);
        }
        Integer j = dynamicStack.pop();
        while( j != null) {
            System.out.printf(" pop: %d\n", j);
            j = dynamicStack.pop();
        }

        /*
        //Testing StaticStack
        abstractStack staticStack = new StaticStack(34);
        for (Integer i = 0; i < 32; i++) {
            staticStack.push(i);
        }
        Integer j = staticStack.pop();
        while( j != null) {
            System.out.printf(" pop: %d\n", j);
            j = staticStack.pop();
        }
         */
    }
}
