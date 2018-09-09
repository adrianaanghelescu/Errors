package ro.siit.max;

import java.util.InputMismatchException;
import java.util.Scanner;


public class CalculateMax {

    public static void main(String[] args) {

        try {

            Scanner s = new Scanner(System.in);
            System.out.print("First number: ");
            int x = s.nextInt();
            System.out.print("Second number: ");
            int y = s.nextInt();
            System.out.print("Third number: ");
            int z = s.nextInt();

            int max = getMax(getMax(x, y), z);
            System.out.println("Maximum number: " + max);
// calculate the maximum with the method bellow that has as parameters the method itself (x,y) and the third variable z

        } catch (InputMismatchException e) {
            System.err.println("Last entered value is not an Integer");
        }

    }

    //calculate the maximum out of 2 numbers
    public static int getMax(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }


}
