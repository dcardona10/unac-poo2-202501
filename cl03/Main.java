public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car("Nissan", "White", 2022, 60000, "Electric");
        Vehicle motorcycle = new Motorcycle("Ducati", "Red", 2018, 40000);
        car.addKilometers(10000);
        motorcycle.addKilometers(10000);
    }
}
