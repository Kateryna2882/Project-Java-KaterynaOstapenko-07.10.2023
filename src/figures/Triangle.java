package figures;

public class Triangle implements GeometricFigure {
    private double sideTriangle;
    private double height;

    public Triangle(double sideTriangle, double height) {
        this.sideTriangle = sideTriangle;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        //        S = 1/2 * side * height
        return 0.5 * sideTriangle * height;
    }

}
