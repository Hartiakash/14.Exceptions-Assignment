package Exceptions_Assignment;

/**
 * @author JALA Academy
 *
 * 1. Write a program to generate Arithmetic Exception without exception handling
 * 2. Handle the Arithmetic exception using try-catch block
 */


// ArithmeticException is thrown when an exceptional condition has occurred in an arithmetic operation.
public class ArithmeticExceptionTryCatch {

    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {
            System.out.println("Inside try block");
            //below code throws divide by zero exception
            c = a / b;
            System.out.println("c = " + c);
        }
        //2. handles the Arithmetic Exception
        catch (java.lang.ArithmeticException e) {
            System.out.println("Handling the Arithmetic exception using try-catch block");
        }

        //1. generating Arithmetic Exception without exception handling
        c = a / b;
        System.out.println("without exception handling");
    }
}