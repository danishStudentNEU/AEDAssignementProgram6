package edu.neu.mgen;

import java.util.Scanner;
public class App 
{

    public static void main( String[] args )
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your word below\n");
        long startTime = System.currentTimeMillis();
        String word = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        if(word.isEmpty()) {
            System.out.println("You did not enter any word");
            return;
        }

        int length = word.length();
        String wordType = length <= 5 ? "short" : (length <= 10 ? "medium" : "long");

        System.out.println("Your word is "+ word);
        System.out.println("The length of the word is "+length);
        System.out.println("It is a " + wordType + "word");
        System.out.println("Your reaction time is "+ (endTime - startTime)/ 1000.0 + "seconds");

        scanner.close();

    }
}
