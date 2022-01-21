package day41_Exceptions;

import day33_Statics.Student;

import java.io.FileInputStream;
import java.util.Locale;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

      // unchecked exception

        int a = 10;
        int b = 0;


        // System.out.println(a / b);
        //System.out.println("Wooden Spoon");

        char[] characters = {'A', 'B', 'C'};
        //                   0,    1,    2

        // System.out.println(characters[]);

        Student student = null;

        //System.out.println( student.getName());

        String str = "Wooden Spoon";

        str = null;

       // System.out.println(str.toUpperCase(Locale.ROOT));

        String str2 = ""; // object != null

        System.out.println(str2.isEmpty());

      // checked exception:

        System.out.println("Hello");

       // Thread.sleep(3000);

        System.out.println("Cydeo");


       // FileInputStream file = new FileInputStream("path of file");

        System.out.println("java");
    }
}
