package areas;

public abstract class Figure {

    protected double base;

    public abstract double getArea();

    public abstract double getPerimeter();

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
