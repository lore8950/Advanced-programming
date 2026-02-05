class Shape {


    public double getPerimeter() {
        return 0.0;   // default value
    }

    // Method to calculate area
    public double getArea() {
        return 0.0;   // default value
    }
}

// Child class
class Circle extends Shape {

    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Override getPerimeter() method
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override getArea() method
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Main class
class ShapeDemo {
    public static void main(String[] args) {

        Circle c = new Circle(7);

        System.out.println("Perimeter of Circle: " + c.getPerimeter());
        System.out.println("Area of Circle: " + c.getArea());
    }
}
