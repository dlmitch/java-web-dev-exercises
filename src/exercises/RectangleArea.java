package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle:");
        Double rectLength = input.nextDouble();
        System.out.println("What is the width of the rectangle:");
        Double rectWidth = input.nextDouble();

        Double rectArea = rectLength*rectWidth;
        System.out.println("The area of this rectangle is " + rectArea + " inches.");
    }

}
