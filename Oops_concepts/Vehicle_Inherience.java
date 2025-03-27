public class Vehicle_Inherience {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "XYZ", 2024, 4);
        System.out.println(audi.brand);
        System.out.println(audi.model);
        System.out.println(audi.year);
        System.out.println(audi.wheels);
        audi.horn();
    }
}

class Vehicle{
    String brand;
    String model;
    int year;
    Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void horn(){
        System.out.println("The vehicle is horning-----");
    }
}

class Car extends Vehicle{
    int wheels;
    Car(String brand, String model, int year, int wheels){
        super(brand, model, year);
        this.wheels = wheels;
    }

}