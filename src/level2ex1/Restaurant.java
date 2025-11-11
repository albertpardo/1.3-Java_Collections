package level2ex1;

import level1ex1.Month;

public class Restaurant {
    private String name;
    private int points;

    public Restaurant(String name, int points){
        this.name = name;
        this.points = points;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Restaurant restaurant = (Restaurant) obj;
        return (name.equals(restaurant.name) && points == restaurant.points);
    }

    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }
}
