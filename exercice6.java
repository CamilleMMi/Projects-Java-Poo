package projectjavajpoo;

import java.util.Scanner;

public class exercice6 {
    public static void main(String[] args) {
        String stringInput;
        int numberWords;

        System.out.println("Choisissez une string de mots : ");
        Scanner scanner = new Scanner(System.in);
        stringInput = scanner.nextLine();

        numberWords = countWords(stringInput);
        System.out.println(numberWords + " Mots");
    }

    public static int countWords(String stringInput) {
        if (stringInput.isEmpty())
            return 0;
        String[] splitWords = stringInput.split("\\s+");
        return splitWords.length;
    }
}
