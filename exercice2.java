package projectjavajpoo;

import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        int size;

        System.out.print("Choisissez une taille : ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        printPyramid(size);
    }
    public static void printPyramid(int size) {
        for (int x = 1; x <= size; x += 1) {
            for (int y = 1; y <= size - x; y += 1) {
                System.out.print(" ");
            }
            for (int y = 1; y <= 2 * x - 1; y += 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
