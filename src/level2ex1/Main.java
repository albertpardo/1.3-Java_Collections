package level2ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    private static void printRestaurantHashSet(HashSet<Restaurant> restaurantHashSet) {
        System.out.println("-- Hashset of restaurants: ");
        for ( Restaurant restaurant : restaurantHashSet)
            System.out.println(restaurant.toString());
    }

    private static void printRestaurantArrayList(ArrayList<Restaurant> restArrLst){
        for ( Restaurant restaurant : restArrLst){
            System.out.println(restaurant.toString());
        }
    }

    public static void main(String[] args){
        HashSet<Restaurant> restaurantHashSet = new HashSet<>();

        restaurantHashSet.add(new Restaurant("restaurant1", 8));
        restaurantHashSet.add(new Restaurant("restaurant1", 7));
        restaurantHashSet.add(new Restaurant("restaurant2", 8));
        restaurantHashSet.add(new Restaurant("restaurant3", 2));
        restaurantHashSet.add(new Restaurant("restaurant1", 10));
        restaurantHashSet.add(new Restaurant("restaurant2", 9));
        restaurantHashSet.add(new Restaurant("restaurant3", 3));
        restaurantHashSet.add(new Restaurant("restaurant3", 4));
        printRestaurantHashSet(restaurantHashSet);

        ArrayList<Restaurant> restaurantArrayList = new ArrayList<>(restaurantHashSet);
        Collections.sort(restaurantArrayList);
        System.out.println("\n--- Sorted ArrayList of restaurants:");
        printRestaurantArrayList(restaurantArrayList);
    }
}
