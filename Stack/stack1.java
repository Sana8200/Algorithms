import java.util.Scanner;
import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        String first = sc.nextLine();
        stack.push(Integer.parseInt(first));
        System.out.println("Enter the second number: ");
        String second = sc.nextLine();
        stack.push(Integer.parseInt(second));

        int firstAdd = stack.pop() + stack.pop();

        System.out.println(stack);

        System.out.println("Enter the third number: ");
        String third = sc.nextLine();
        stack.push(Integer.parseInt(third));
        System.out.println("Enter the fourth number: ");
        String fourth = sc.nextLine();
        stack.push(Integer.parseInt(fourth));


        int secondAdd = stack.pop() + stack.pop();
        stack.push(firstAdd);
        stack.push(secondAdd);

        System.out.println(stack);

        int calculator = stack.pop() * stack.pop();
        stack.push(calculator);
        System.out.println(stack);


/*
        stack.push(3);
        stack.push(4);

        int firstAdd = stack.pop() + stack.pop();
        stack.push(firstAdd);
        stack.push(2);
        stack.push(4);
        int secondAdd = stack.pop() + stack.pop();
        stack.push(secondAdd);
        int thirdOper = firstAdd * secondAdd;
        stack.push(thirdOper);
        System.out.println(stack);


       stack.push(3 + 4);
       stack.push(2 + 4);
       int operation = stack.pop() * stack.pop();
       stack.push(operation);
       System.out.println(stack);
*/

    }
}
