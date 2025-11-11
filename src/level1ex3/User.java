package level1ex3;

public class User {
    private String name;
    private int points;

    public User(String name){
        this.name = name;
        this.points = 0;
    }

    public int getPoints(){
        return points;
    }

    public void addPoint(){
        points ++;
    }

    public String getStringFormatToPutInClassificationFile(){
        return (name + " " + points);
    }
}
