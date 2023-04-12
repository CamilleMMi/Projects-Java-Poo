import java.util.Random;
import java.util.Scanner;

public class exercice5 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100 - 10) + 10;
        int attempt = 0;
        int count = 0;

        System.out.println("Un nombre aléatoire entre 10 et 100 a été généré");

        while (true) {
            System.out.println("Choisissez un nombre : ");
            count += 1;
            Scanner scanner = new Scanner(System.in);
            attempt = scanner.nextInt();

            if (attempt == randomNumber) {
                break;
            }

            if (attempt < randomNumber) {
                System.out.println("Plus grand");
            } else {
                System.out.println("Plus petit");
            }
        }

        System.out.println("Le nombre à trouvé était " + randomNumber + " Vous avez réussi en " + count + " essais");
    }
}
