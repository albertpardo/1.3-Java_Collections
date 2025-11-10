package level1ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    private static void printArrayListForLoop(ArrayList<Month> months){
        Month month;

        System.out.println("-- Print ArrayList using for-loop:");
        for (int i = 0; i < months.size(); i++){
            month = months.get(i);
            System.out.println("- id: " + i + ", " + month.getName());
        }
    }

    private static void printArrayListIterator(ArrayList<Month> months){
        Iterator<Month> iterator;

        iterator = months.iterator();
        System.out.println("-- Print ArrayList using Iterator:");
        while (iterator.hasNext()){
            System.out.println("- " + iterator.next().getName());
        }
    }

    private static void printHashSetIterator(HashSet<Month> monthHashSet){
        Iterator<Month> iterator;

        iterator = monthHashSet.iterator();
        System.out.println("-- Print HashSet using Iterator:");
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next().getName());
        }
    }

    private static void addMonthsToArrayListTest(ArrayList<Month> months){
        System.out.println("------ Test Add months to ArrayList ------");
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        printArrayListForLoop(months);
        System.out.println();

        months.add(7,new Month("August"));
        printArrayListForLoop(months);
        System.out.println();
    }
    private static void dublicateMonthsInMonthsArrayList(ArrayList<Month> monthsArrayList) {
        System.out.println("------ Test Duplicated February in ArrayList ------");
        monthsArrayList.add(new Month("February"));
        monthsArrayList.add(new Month("February"));
        monthsArrayList.add(new Month("February"));
        monthsArrayList.add(new Month("February"));
        monthsArrayList.add(new Month("February"));
        printArrayListForLoop(monthsArrayList);
        System.out.println();
    }

    private static void convertArrayListToHashSetAndCheckNoRepeat(ArrayList<Month> monthsArrayList) {

        System.out.println("------ HashSet Part ------");
        HashSet<Month> monthsHashSet = new HashSet<>(monthsArrayList);
        System.out.println("From 'ArrayList<Month>' to 'HashSet<Month>' duplicates doesn't added ");
        printHashSetIterator(monthsHashSet);
        System.out.println("Try to add 'December` month as duplicated in'HashSet<Month>' duplicates doesn't added ");
        monthsHashSet.add(new Month("December"));
        printHashSetIterator(monthsHashSet);
    }

    public static void main(String args[]){
        ArrayList<Month> monthsArrayList = new ArrayList<>();

        addMonthsToArrayListTest(monthsArrayList);
        System.out.println();
        printArrayListIterator(monthsArrayList);
        System.out.println();
        dublicateMonthsInMonthsArrayList(monthsArrayList);
        System.out.println();
        convertArrayListToHashSetAndCheckNoRepeat(monthsArrayList);
    }


}
