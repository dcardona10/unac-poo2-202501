public class Car extends Vehicle{

    private String type;

    public Car(String brand, String color, int year, long kilometers, String type) {
        super(brand, color, year, kilometers);
        this.type = type;
    }

    public void showMaintenanceAlert() {
        if (this.getType().equals("Electric") && this.getKilometers() >= 50000) {
            System.out.println("Battery maintenance pending");
        } else if (this.getType().equals("Fuel") && this.getKilometers() >= 30000) {
            System.out.println("Motor oil change pending");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
