import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {
        int number;

        System.out.print("Choisissez une nombre : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        checkPrimeNumber(number);
        checkOddEven(number);
    }

    public static void checkOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " Nombre pair");
        } else {
            System.out.println(number + " Pas un nombre impair");
        }
    }

    public static void checkPrimeNumber(int number) {
        boolean numberPrime = true;

        for (int x = 2; x <= number / 2; x += 1) {
            if (number % x == 0) {
                numberPrime = false;
                break;
            }
        }

        if (numberPrime) {
            System.out.println(number + " Nombre premier");
        } else {
            System.out.println(number + " Pas un nombre premier");
        }
    }
}
