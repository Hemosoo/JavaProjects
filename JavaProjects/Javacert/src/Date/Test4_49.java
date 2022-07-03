package Date;

import java.time.LocalDate;
import java.util.ArrayList;
public class Test4_49 {
	ublic static void main(String[] args) {

        ArrayList myList = new ArrayList();

        String[] myArray;

        try {

            while (true) {

                myList.add("My String");

            }

        }

        catch (Exception e) {

            System.out.println("Caught an Exception:");

        }

        catch (RuntimeException re) {

            System.out.println("Caught a RuntimeException");

        }

        System.out.println("Ready to use");

    }

}
