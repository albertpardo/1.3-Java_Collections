package level2ex2;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {

    private static void printRestaurantArrayList(String titleMsg,ArrayList<Restaurant> restArrLst){
        System.out.println(titleMsg);
        for ( Restaurant restaurant : restArrLst){
            System.out.println(restaurant.toString());
        }
    }

    private static void printRestaurantsTreeSet(String titleMsg, TreeSet<Restaurant> restaurantTS){
        System.out.println(titleMsg);
        for ( Restaurant restaurant : restaurantTS){
            System.out.println(restaurant.toString());
        }
    }

    private static void exercise2WithArrayList(){
        ArrayList<Restaurant> restaurantArrayList = new ArrayList<>();

        System.out.println("**** Exercise 2 using ArrayList ****");
        restaurantArrayList.add(new Restaurant("restaurant1", 8));
        restaurantArrayList.add(new Restaurant("restaurant1", 7));
        restaurantArrayList.add(new Restaurant("restaurant2", 8));
        restaurantArrayList.add(new Restaurant("restaurant3", 2));
        restaurantArrayList.add(new Restaurant("restaurant1", 10));
        restaurantArrayList.add(new Restaurant("restaurant2", 9));
        restaurantArrayList.add(new Restaurant("restaurant3", 3));
        restaurantArrayList.add(new Restaurant("restaurant3", 4));

        printRestaurantArrayList("--- Original ArrayList of restaurants:", restaurantArrayList);
        Collections.sort(restaurantArrayList);
        printRestaurantArrayList("\n--- Sorted ArrayList of restaurants:", restaurantArrayList);
    }

    private static void exercise2WithTreeSet(){
        TreeSet<Restaurant> restaurantTreeSet = new TreeSet<>();

        System.out.println("\n**** Exercise 2 using TreeSet: ");
        restaurantTreeSet.add(new Restaurant("restaurant1", 8));
        restaurantTreeSet.add(new Restaurant("restaurant1", 7));
        restaurantTreeSet.add(new Restaurant("restaurant2", 8));
        restaurantTreeSet.add(new Restaurant("restaurant3", 2));
        restaurantTreeSet.add(new Restaurant("restaurant1", 10));
        restaurantTreeSet.add(new Restaurant("restaurant2", 9));
        restaurantTreeSet.add(new Restaurant("restaurant3", 3));
        restaurantTreeSet.add(new Restaurant("restaurant3", 4));
        printRestaurantsTreeSet("--- Restaurant TreeSet  after insert restaurants:", restaurantTreeSet);

    }

    public static void main(String[] args){
        exercise2WithArrayList();
        exercise2WithTreeSet();
    }
}
