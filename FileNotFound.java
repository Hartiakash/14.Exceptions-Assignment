package Exceptions_Assignment;

/**
 * @author JALA Academy
 *
 * 11.Write a program to generate FileNotFoundException
 */

import java.io.*;

// FileNotFoundException occurs when we attempt to open the file denoted by a specified pathname has failed.
public class FileNotFound {
    public static void main(String[] args) {

        try {
            // create instance of the BufferedReader and pass the FileReader instance to it.
            BufferedReader reader = new BufferedReader(new FileReader(new File("/invalid/file/location")));
        }
        //FileNotFoundException is a subclass of IOException.
        catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException caught!");
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}