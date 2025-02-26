public class Motorcycle extends Vehicle{

    public Motorcycle(String brand, String color, int year, long kilometers) {
        super(brand, color, year, kilometers);
    }

    public void showMaintenanceAlert() {
        if (this.getKilometers() >= 30000) {
            System.out.println("Maintenance pending");
        }
    }
}
