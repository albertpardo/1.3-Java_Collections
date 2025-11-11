package level2ex2;

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
        return (name.equalsIgnoreCase(restaurant.name) && points == restaurant.points);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name.toLowerCase(), points);
    }

    @Override
    public String toString(){
        return "name :" + name + ", points: " + points;
    }
}
