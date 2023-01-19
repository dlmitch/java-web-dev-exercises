package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle:");
        Double radius = input.nextDouble();
//        Double pi = 3.14;

        Double area = Circle.getArea(radius);
        if (radius < 0 ) {
            System.out.println("Enter a non-negative number for radius.");

//         //BONUS need validation for non-numeric, empty str, and to print an error message and quit

        } else {
            System.out.println("The area of this circle is " + area + ".");


        }
    }

}
