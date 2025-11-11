package level1ex3;

import java.io.*;
import java.util.*;

public class Main {
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
    private static HashMap<String, String> getCountriesFromFile(InputStream inputStream) {
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

    private static String inputStringByCli(String msgQuest, String msgErr){
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (input.isEmpty()) {
            System.out.println(msgQuest);
            input = scanner.nextLine();
            if (input.isEmpty())
                System.err.println(msgErr);
        }
        return input;
    }
    private static User getUser(){
        String name;

        name = inputStringByCli("What is your name?", "Empty name is not allowed!");
        return (new User(name));
    }

    private static void play(User user, HashMap<String, String> countryCapitalHashMap) {
        ArrayList<String> keyCountriesArrayList= new ArrayList<>(countryCapitalHashMap.keySet());
        Collections.shuffle(keyCountriesArrayList);
        String answer;
        String country;
        String capital;
        int numQuestions = 10;

        for (int i = 0; i < numQuestions; i++){
            country = keyCountriesArrayList.get(i);
            capital = countryCapitalHashMap.get(country);
            answer = inputStringByCli("What is the capital for " + country + "?", "Empty capital is not allowed!");
            if (answer.equalsIgnoreCase(capital))
                user.addPoint();
            else
                System.out.println("Your answer '" + answer + "' is wrong. The capital for '" + country + "' is '" + capital + "'.");
        }
        System.out.println(" -- The game has ended -- ");
        System.out.println(" You answered " + user.getPoints() + " out of " + numQuestions + " questions correctly.");
    }

    private static void playGame(HashMap<String, String> countryCapitalHashMap, String outputFile){
        User user;

        user = getUser();
        play(user, countryCapitalHashMap);
        writeResultToFile(user.getStringFormatToPutInClassificationFile(), outputFile);
    }

    public static void main(String[] args) {

        InputStream inputStream = Main.class.getResourceAsStream(FilesNamesAsConstants.COUNTRIES);
        HashMap<String, String> countriesCapitalHashMap;

        if (existFile(inputStream)){
            //printReadFileTxtContentByElements(inputStream);
            //printReadFileTxtContent(inputStream);
            countriesCapitalHashMap = getCountriesFromFile(inputStream);
            System.out.println(countriesCapitalHashMap);
            playGame(countriesCapitalHashMap, FilesNamesAsConstants.CLASSIFICATION);
        }
    }
}
