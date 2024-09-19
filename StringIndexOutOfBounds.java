package Exceptions_Assignment;

/**
 * @author JALA Academy
 *
 * 17. Write a program to generate StringIndexOutOfBoundsException
 */
/* StringIndexOutOfBoundsException :
It is thrown by String class methods to indicate that an index is
either negative or greater than the size of the string */
public class StringIndexOutOfBounds {
    public static void main(String[] args) {

        String str = "Sharan";
        try {
            // Trying to access at negative index
            char charAtNegativeIndex = str.charAt(-1);
            // Trying to access at index equal to size of the string
            char charAtLengthIndex = str.charAt(11);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("StringIndexOutOfBoundsException caught");
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}
