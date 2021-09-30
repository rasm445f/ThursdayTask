package javabase_fileHandeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        new Main().findLongestWord();

    }

    public String findLongestWord() throws FileNotFoundException {

        String longestWord = "";
        String current;
        Scanner in = new Scanner(new File("/Users/rasmustaul/Desktop/Test.txt"));

        while (in.hasNext()) {
            current = in.next();

            if (current.length() > longestWord.length()) {
                longestWord = current;
            }
        }
        System.out.println("the longest word in the file is: " + longestWord);
        return longestWord;
    }


}

