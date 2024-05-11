package homework_nr_4;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Площадь круга с радиусом " + radius + " равна: " + area);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.calculateArea();
    }
}
