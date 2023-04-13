package projectjavajpoo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercice8 {
    public static void main(String[] args) {
        String path;
        int count;

        System.out.println("Entrez le chemin du fichier : ");
        Scanner scanner = new Scanner(System.in);

        path = scanner.nextLine();
        count = countWordsInFile(path);

        if (count != -1) {
            System.out.println(count + " Mots dans le fichier");
        }
    }

    public static int countWordsInFile(String path) {
        try {
            File file;
            int count = 0;

            file = new File(path);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String ligne = scanner.nextLine();
                count += ligne.split("\\s+").length;
            }
            scanner.close();
            return count;
        } catch (FileNotFoundException error) {
            System.out.println("Ahah bien essayé je le trouve pas ton fichier texte là");
            return -1;
        }
    }
}
