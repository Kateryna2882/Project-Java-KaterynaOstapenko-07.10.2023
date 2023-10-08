package figures;

public class Square implements GeometricFigure{
    private double sideSquare;

    public Square(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    @Override
    public double calculateArea() {
        //        S = side * side
        return sideSquare * sideSquare;
    }
}
