package areas;

public class Triangle extends Figure {

    private double height;

    @Override
    public double getArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public double getPerimeter() {
        return (getSide() * 2) + this.base;
    }

    private double getSide() {
        return Math.sqrt(Math.pow(this.base / 2, 2) + Math.pow(this.height, 2));
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
