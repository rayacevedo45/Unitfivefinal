package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Access Code 2.1
 * Ray Acevedo
 * Sentinel.java
 */
public class Sentinel
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println(
                "Give me a list of numbers, when you are done enter 0 and I will tell you the min ad max values.");
        while(true)
        {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if(input != 0)
            {
                numbers.add(input);
            }
            else
            {
                System.out.println("Thanks, the min value of your list is " + Collections
                        .min(numbers) + " and the max value is " + Collections.max(numbers) + ".");

            }
        }

    }
}
