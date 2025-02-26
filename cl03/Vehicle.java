public abstract class Vehicle {

    public Vehicle(String brand, String color, int year, long kilometers) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.kilometers = kilometers;
    }

    private String brand;
    private String color;
    private int year;
    private long kilometers;

    public abstract void showMaintenanceAlert();

    public void addKilometers(long kilometers) {
        setKilometers(this.getKilometers() + kilometers);
        System.out.println("Kilometers: " + this.getKilometers());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getKilometers() {
        return kilometers;
    }

    public void setKilometers(long kilometers) {
        this.kilometers = kilometers;
    }
}
