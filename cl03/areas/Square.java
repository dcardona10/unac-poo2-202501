package areas;

public class Square extends Figure {

    @Override
    public double getArea() {
        return Math.pow(this.base, 2);
    }

    @Override
    public double getPerimeter() {
        return this.base * 4;
    }
}
