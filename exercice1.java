package projectjavajpoo;

import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {
        System.out.print("Saisissez une phrase : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversedString = reverseString(input);
        System.out.println(reversedString);
    }

    public static String reverseString(String string) {
        String reversedString = "";
        for (int x = string.length() - 1; x >= 0; x = x - 1) {
            reversedString += string.charAt(x);
        }
        return reversedString;
    }
}