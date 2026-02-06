public class Box {
    public double area() {
        return 0.0;
    }
}

// Child class
class Rectangle extends Box {
    private int length;
    private int height;

    // Constructor
    Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    // Override
    @Override
    public double area() {
        return length * height;
    }

    Rectangle Lincrement(int amount) {
        length += amount;
        return this;
    }

    Rectangle Ldecrement(int amount) {
        length -= amount;
        return this;
    }

    Rectangle Hincrement(int amount) {
        height += amount;
        return this;
    }

    Rectangle Hdecrement(int amount) {
        height -= amount;
        return this;
    }
}


 class BoxTest {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);

        r.Lincrement(2);
        r.Hincrement(3);
        r.Ldecrement(1);
        r.Hdecrement(1);

        System.out.println("Area of the Box: " + r.area());
    }
}
