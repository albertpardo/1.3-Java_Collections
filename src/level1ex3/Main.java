package level1ex3;

import javax.sound.midi.Synthesizer;
import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
    private static HashMap<String, String> getContriesFromFile(InputStream inputStream) {
        HashMap<String, String> countriesHM = new HashMap<>();
        Scanner sc = new Scanner(inputStream);
        String[] stringsLine;

        while (sc.hasNextLine()) {
            stringsLine = sc.nextLine().split(" ");
            if (stringsLine.length > 1)
                countriesHM.put(stringsLine[0], stringsLine[1]);
        }
        sc.close();
        return countriesHM;
    }

    private static void writeResultToFile(String textToWrite, String outpuFile){
        try (PrintWriter writer = new PrintWriter(new FileWriter(outpuFile, true))) {
            writer.println(textToWrite);
        } catch (IOException e) {
            System.out.println("ERROR: During writing process -> " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        InputStream inputStream = Main.class.getResourceAsStream(FilesNamesAsConstants.COUNTRIES);
        HashMap<String, String> countriesHashMap;

        if (existFile(inputStream)){
            //printReadFileTxtContentByElements(inputStream);
            //printReadFileTxtContent(inputStream);
            countriesHashMap = getContriesFromFile(inputStream);
            System.out.println(countriesHashMap);

            String textToWrite = "Esta es una línea de texto de ejemplo.";
            writeResultToFile(textToWrite, FilesNamesAsConstants.CLASSIFICATION);
        }
    }
}
