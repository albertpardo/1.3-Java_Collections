package level1ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Main {
    private static void printIntegerList(List<Integer> list){
        Iterator<Integer> iterator;

        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("-> " + iterator.next());
        }
    }

    private static void copyIntegerListInReverseOrder(List<Integer> listOrigin, List<Integer> listDestination){
        ListIterator<Integer> listIteratorOrigin;

        listIteratorOrigin = listOrigin.listIterator(listOrigin.size());
        while (listIteratorOrigin.hasPrevious()){
            listDestination.add(listIteratorOrigin.previous());
        }
    }

    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();

        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);

        System.out.println("-- 'listOne' with Integers : ");
        printIntegerList(listOne);

        System.out.println("\n--Copy 'listOne' to 'listTwo' in reverse order and print 'listTwo'");
        copyIntegerListInReverseOrder(listOne, listTwo);
        printIntegerList(listTwo);
    }
}
