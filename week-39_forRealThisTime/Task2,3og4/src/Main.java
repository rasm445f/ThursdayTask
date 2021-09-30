import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static char[] chars;
    static Scanner scan;
    private static String[] text;


    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/rasmustaul/Desktop/Test.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        chars = inputFromFile.toLowerCase().toCharArray();

        // printWordsStartingWith("Ø");

        // printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:
        // printHalf(text); // task2
        numOfChar(chars); // task3 og task4


    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordisvalid = false;
                }

                if (wordisvalid) {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:

    private static void printHalf(String[] text) {
        for (int i = 0; i < text.length; i++) {
            int textLength = text[i].length();
            String getHalf = text[i].substring(0, textLength / 2);
            System.out.println(getHalf + " ");


        }
    }

    private static void numOfChar(char[] i) {
        Arrays.sort(i);
        //System.out.println(i);

        int index = 0;
        char currentChar;
        int countChar;


        while (index < i.length) {
            currentChar = i[index];

            countChar = 0;

            for (; index < i.length && currentChar == i[index]; index++, countChar++) ;

            System.out.println(currentChar + ":" + countChar);

        }


    }


}




