package figures;

public class Circle implements GeometricFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
//        S = Пі * radius * radius
        return Math.PI * radius * radius;
    }
}
