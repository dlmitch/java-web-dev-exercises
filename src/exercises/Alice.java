package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister" +
                " on the bank, and of having nothing to do: once or twice she had peeped into " +
                "the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("What word would you like to search for in this sentence? ");
        String searchTerm = input.nextLine();
        if (firstSentence.toLowerCase().contains(searchTerm)) {
            System.out.println("The word " + searchTerm + " was found in this sentence");
        } else {
            System.out.println("The word " + searchTerm + " was NOT found in this sentence");
        }
    }
}

