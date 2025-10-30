package lab09;

import java.util.Scanner;
import java.util.Stack;

public class ExpressionEvaluator {
    // This method computes the result based on the operator and operands
    public static double compute(char op, double op1, double op2) {
        if (op == '+')
            return op2 + op1;
        else if (op == '−')
            return op2 - op1;
        else if (op == '*')
            return op2 * op1;
        else if (op == '/')
            return op2 / op1;
        else
            throw new IllegalArgumentException("Invalid operator");
    }

    // This method appends extra spaces before parentheses and operators
    //     to split the expression easier later
    public static String addBlanks(String expr) {
        //TODO add code below
    }
    
    // This method evaluates the given expression (expr) using Stacks
    public static double evaluate(String expr) {
         //TODO add code below
    }

    // the main entry point of this application
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an expression: ");
            String expr = sc.nextLine(); // read the input expression
            if (expr.equalsIgnoreCase("exit")) // exit the program if exit is entered
                break;
            // try to evaluate the expression and print the result
            try {
                System.out.println("Result: " + evaluate(expr));
            } catch (Exception ex) {
                System.out.println("Invalid expression!");
            }
        }
    }
}
