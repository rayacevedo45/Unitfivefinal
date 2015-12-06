package com.company;
import java.util.ArrayList;
import java.util.Random;

/**
 * Access Code 2.1
 * Ray Acevedo
 * HangMan.java
 */
public class HangMan
{
    //make arraylist of random words
    //sout lets play hang man
    //generate random word from arraylist
    //if word.length == 3 sout _ _ _
    //sout make your first guess (char)
    //if word contains char (a) sout good guess
    //find a way to print _ a _
    //if ! contains try again int incorrectguess ++ draw head ++
    public static void main(String[] args)
    {
        ArrayList<String>words = new ArrayList<String>();
        words.add("car");
        words.add("hello");
        words.add("access");
        System.out.println("Lets play hangman;");
        Random r = new Random();
        int random = r.nextInt(words.size() - 0) + 0;
        //System.out.println(random);
        String word = words.get(random);
        //System.out.println(word);

    }
}
