package Exceptions_Assignment;

/**
 * @author JALA Academy
 *
 * 3.Write a method which throws exception, Call that method in main class without try block
 */
/* We can throw either checked or unchecked exceptions in Java by throw keyword.
It is mainly used to throw a custom exception. */
public class MethodThrowsException {
    static void throwException() {
        //throw keyword is used to invoke an exception explicitly.
        throw new RuntimeException("Throwing exception");
    }

    public static void main(String[] args) {
        //Calling method in main class without try block
        throwException();
    }
}
