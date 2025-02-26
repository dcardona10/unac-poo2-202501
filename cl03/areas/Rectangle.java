package areas;

public class Rectangle extends Figure{

    private double height;

    @Override
    public double getArea() {
        return this.base * this.height;
    }

    @Override
    public double getPerimeter() {
        return (this.base + this.height) * 2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
