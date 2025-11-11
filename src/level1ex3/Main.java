package level1ex3;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static void startGame(File inputFile, String classificationNameFile) {

    }

    public static void main(String[] args) {

        InputStream inputStream = Main.class.getResourceAsStream(FilesNamesAsConstants.COUNTRIES);
        if (inputStream == null) {
            System.err.println(FilesNamesAsConstants.COUNTRIES + " has not been found.");
        } else {
            Scanner sc = new Scanner(inputStream);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
    }
}
