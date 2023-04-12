import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exercice7 {
    public static void main(String[] args) {
        String fileName;
        String fileContent;

        System.out.print("Choisissez une phrase à sauvegarder : ");
        Scanner scanner = new Scanner(System.in);
        fileContent = scanner.nextLine();

        System.out.println("Quel nom voulez vous pour le fichier dans le quel la phrase sera sauvegardé ? : ");
        Scanner scanner1 = new Scanner(System.in);
        fileName = scanner1.nextLine();

        saveSentenceInFile(fileName, fileContent);
        System.out.println("La phrase a été sauvegarder dans le fichier" + fileName);

    }
    public static void saveSentenceInFile(String fileName, String fileContent) {
        try {
            FileWriter writer = new FileWriter(fileName + ".txt");
            writer.write(fileContent);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
