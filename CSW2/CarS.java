import java.util.TreeMap;

public class CarS {
    public static void main(String[] args) {
        CarCollection carCollection = new CarCollection();

        carCollection.addCar(new Car("BMW", "M5", 2010));
        carCollection.addCar(new Car("AUDI", "S-class", 2012));
        carCollection.addCar(new Car("Ford", "Mustang", 2015));

        Car higherEntry = carCollection.findHigherEntry(2012);
        System.out.println("Higher entry than 2012: " + higherEntry);

        Car lastEntry = carCollection.findLastEntry();
        System.out.println("Last entry: " + lastEntry);

        Car firstEntry = carCollection.findFirstEntry();
        System.out.println("First entry: " + firstEntry);
    }
}

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

class CarCollection {
    private TreeMap<Integer, Car> cars;

    public CarCollection() {
        cars = new TreeMap<>();
    }

    public void addCar(Car car) {
        cars.put(car.getYear(), car);
    }

    public Car findHigherEntry(int year) {
        return cars.higherEntry(year).getValue();
    }

    public Car findLastEntry() {
        return cars.lastEntry().getValue();
    }

    public Car findFirstEntry() {
        return cars.firstEntry().getValue();
    }
}
