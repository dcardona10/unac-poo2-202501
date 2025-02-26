package areas;

public class Main {

    public static void main(String[] args) {

        Square square = new Square();
        square.setBase(3);
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.setBase(4);
        rectangle.setHeight(2);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle();
        triangle.setBase(6);
        triangle.setHeight(4);
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());

        Circle circle = new Circle();
        circle.setRadius(6);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
    }
}
