package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String color;
    private int series;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Car(String model, String color, int series) {
        this.model = model;
        this.color = color;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", series=" + series +
                '}';
    }

    public List<Car> allCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "Black", 3));
        cars.add(new Car("Mercedes", "Black", 5));
        cars.add(new Car("Opel", "Yellow", 1));
        cars.add(new Car("Nissan", "White", 6));
        cars.add(new Car("Cherry", "White", 2));
        return cars;
    }
}

