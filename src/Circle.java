public class Circle {


    public final double PI = 3.14;
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public  double area() {
        return PI * (radius * radius);
    }

    public double circumference() {
        return PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle" +
                "\nPI = " + PI +
                ",\nradius = " + radius ;
    }
}
