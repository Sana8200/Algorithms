import java.io.*;


public class HP35 {

    public static void main(String[] args) throws IOException {
        abstractStack stack = new DynamicStack();
        System.out.println("HP-35 pocket calculator");
        boolean run = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (run) {
            System.out.print(" > ");
            String input_line = br.readLine();
            for (var input : input_line.toCharArray()) {
                switch (input) {
                    case '+': {
                        int a = stack.pop();
                        int b = stack.pop();
                        int result = a + b;
                        if( a == -1 || b == -1){
                            throw new ArithmeticException("no valid input numbers.");
                        }
                        System.out.println("a (" + a + ") + b (" + b + ") = " + result);
                        stack.push(result);
                        break;
                    }

                    // pop two numbers, add and push result break;
                    case '-': {
                        int a = stack.pop();
                        int b = stack.pop();
                        int result = b - a;
                        if( a == -1 || b == -1){
                            throw new ArithmeticException("no valid input numbers.");
                        }
                        System.out.println("b (" + b + ") - a (" + a + ") = " + result);
                        stack.push(result);
                        break;
                    }

                    case '*': {
                        int a = stack.pop();
                        int b = stack.pop();
                        int result = a * b;
                        if( a == -1 || b == -1){
                            throw new ArithmeticException("no valid input numbers.");
                        }
                        System.out.println("a (" + a + ") * b (" + b + ") = " + result);
                        stack.push(result);
                        break;
                    }
                    case '/': {
                        int a = stack.pop();
                        int b = stack.pop();
                        if (b == 0) {
                            throw new ArithmeticException("Division by zero, cannot divide by zero");
                        }
                        if( a == -1 || b == -1){
                            throw new ArithmeticException("no valid input numbers.");
                        }
                        System.out.println("a (" + a + ") / b (" + b + ") = " + a);
                        int result = a / b;
                        stack.push(result);
                    }
                    case ' ':
                        break;
                    default:
                        if (Character.isDigit(input)) {
                            stack.push(Character.getNumericValue(input));
                        } else {
                            throw new ArithmeticException("Invalid input");
                        }
                        break;
                }
            }
            if (stack.top != -1 ) {
                System.out.printf("The result is: %d\n\n", stack.pop());
            } else {
                System.out.println("Stack is empty. No result to display.");
            }
            System.out.println("I love reversed Polish notation, don't you?");
        }
    }
}
