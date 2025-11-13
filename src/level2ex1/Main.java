package level2ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class Main {
    private static void printRestaurantHashSet(HashSet<Restaurant> restaurantHashSet) {
        System.out.println("-- Hashset of restaurants: ");
        for ( Restaurant restaurant : restaurantHashSet)
            System.out.println(restaurant.toString());
    }

    public static void main(String[] args){
        HashSet<Restaurant> restaurantHashSet = new HashSet<>();

        Restaurant restaurant1with8 = new Restaurant("restaurant1", 8);
        restaurantHashSet.add(restaurant1with8);
        restaurantHashSet.add(new Restaurant("restaurant1", 7));
        restaurantHashSet.add(new Restaurant("restaurant2", 8));
        restaurantHashSet.add(new Restaurant("restaurant3", 2));
        printRestaurantHashSet(restaurantHashSet);

        System.out.println("\nAdd again: " + restaurant1with8.toString());
        restaurantHashSet.add(restaurant1with8);
        printRestaurantHashSet(restaurantHashSet);

    }
}
