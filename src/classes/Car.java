package classes;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayDetails(){
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    public boolean isOlderThan(int givenYear){
        return givenYear < year;
    }

}
