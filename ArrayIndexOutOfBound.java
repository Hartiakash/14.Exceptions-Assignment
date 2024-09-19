package Exceptions_Assignment;

/**
 * @author JALA Academy
 *
 * 9. Write a program to generate ArrayIndexOutOfBoundException
 */
/*
ArrayIndexOutOfBoundsException :
It is thrown to indicate that an array has been accessed with an illegal index.
The index is either negative or greater than or equal to the size of the array.
 */
public class ArrayIndexOutOfBound {

    public static void main(String[] args) {
        //Declaring 4 elements in the String array
        String[] arr = {"Sharan", "Rahul", "Leo", "Arun"};
        //ArrayIndexOutOfBoundException because there is no 5th index
        try {
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("ArrayIndexOutOfBoundsException caught");
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}
