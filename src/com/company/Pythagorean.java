package com.company;
import java.util.Scanner;

/**
 * Access Code 2.1
 * Ray Acevedo
 * Pythagorean.java
 */
public class Pythagorean
{
    //    The Pythagorean theorem for the relationship of the lengths of the three sides of a right
    //    triangle: a2 + b2 = c2 which can alternatively be written as: c =a2+b2
    //    Write a program that accepts values for a and b as doubles (you can assume that a and b will be positive)
    //    and then calculates the solution of c as a double. Your program should be able to duplicate the following sample run:
    public static void main(String[] args)
    {
        System.out.println("Enter a double.");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Enter another number.");
        double b = scanner.nextDouble();

        System.out.println("pythagorean = " + pythagorean(a, b));
    }

    public static double pythagorean(double a, double b)
    {
        double aSquared = a * a;
        double bSquared = b * b;
        double ab = aSquared + bSquared;
        return Math.sqrt(ab);
    }
}
