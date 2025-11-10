package level1ex1;

public class Month {
    private String name;

    public Month(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Month month = (Month) obj;
        return name.equalsIgnoreCase(month.name);
    }

    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }
}
