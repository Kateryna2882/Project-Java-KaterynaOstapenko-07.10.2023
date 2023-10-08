package figures;

public class Main {
    public static void main(String[] args) {
        GeometricFigure[] figures = new GeometricFigure[3];
        figures[0] = new Circle(10.0);
        figures[1] = new Triangle(4.0, 2.5);
        figures[2] = new Square(5.0);


        double totalArea = 0;
        for (GeometricFigure figure : figures) {
            totalArea += figure.calculateArea();
        }
        System.out.println("The total area of all figures in this array S =  "
                + totalArea + " (sm^2)");
    }
}

