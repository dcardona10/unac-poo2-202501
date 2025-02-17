public class Vehicle {

    public String color;
    public String brand;
    public int year;
    public long kilometers;
    public String fuelType;

    public void start() {
        System.out.println("Vehicle started.");
    }

    public long getKilometers() {
        return this.kilometers;
    }

    public int getFuelLevel(String fuelType) {
        int batteryLevel = 45;
        int fuelLevel = 200;
        int level = 0;
        if (fuelType.equals("Electric") || fuelType.equals("Hybrid")) {
            level = batteryLevel;
        }
        if (fuelType.equals("Fuel")) {
            level = fuelLevel;
        }

        return level;
    }
}
