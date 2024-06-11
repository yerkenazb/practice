package mindtek.functionalInterfaces3;

public class Car {

    private String model;
    private int year;
    private String color;
    private String type;

    public Car(String model, int year, String color, String type) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.type = type;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
