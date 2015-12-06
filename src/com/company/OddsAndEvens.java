package com.company;
import java.util.Scanner;

/**
 * Access Code 2.1
 * Ray Acevedo
 * OddsAndEvens.java
 */
public class OddsAndEvens
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number.");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        getToOne(input);
    }

    public static void getToOne(int n)
    {
        while(n > 1)
        {
            if(n == 1)
            {
                System.out.println(1);
            }
            else if((n % 2) == 0)
            {
                n = n / 2;
                System.out.println(n);
            }
            else
            {
                n = n * 3 + 1;
                System.out.println(n);
            }
        }
    }
}
