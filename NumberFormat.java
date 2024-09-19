package Exceptions_Assignment;

/**
 * @author JALA Academy
 * @author K.Sharan Simha Reddy
 *
 * 16. Write a program to generate NumberFormatException
 */
/* NumberFormatException :
This exception is raised when a method could not convert a string into a numeric format. */
public class NumberFormat {
    public static void main(String[] args) {

        String str = "111ABC";
        try {
            // Converting string with inappropriate format
            int x = Integer.parseInt(str);
            int y = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException caught!");
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}
