package level1ex3;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static void startGame(File inputFile, String classificationNameFile) {

    }

    private static void printReadFileTxtContent(InputStream inputStream){
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

    private static void printReadFileTxtContentByElements(InputStream inputStream){
        Scanner sc = new Scanner(inputStream);
        String[] stringsLine;

        while (sc.hasNextLine()) {
            stringsLine = sc.nextLine().split(" ");
            if (stringsLine.length > 1)
                System.out.println(stringsLine[0] + ", " + stringsLine[1]);
        }
        sc.close();
    }

    private static boolean existFile(InputStream file){
        if (file != null)
            return true;
        System.err.println(FilesNamesAsConstants.COUNTRIES + " has not been found.");
        return false;
    }

    public static void main(String[] args) {

        InputStream inputStream = Main.class.getResourceAsStream(FilesNamesAsConstants.COUNTRIES);

        if (existFile(inputStream)){
            printReadFileTxtContentByElements(inputStream);
            //printReadFileTxtContent(inputStream);
        }
    }
}
