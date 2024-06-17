// Base class
class Shape {
    // Method to be overridden by subclasses
    void draw() {
        System.out.println("Drawing a Shape");
    }
}

// Derived class Circle
class Circle extends Shape {
    // Overriding the draw method
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    // Overriding the draw method
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class to demonstrate method overriding
public class MethodOverriding {
    public static void main(String[] args) {
        // Creating instances of subclasses
        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();

        // Polymorphic call to the overridden method
        myCircle.draw();        // Calls Circle's draw method
        myRectangle.draw();     // Calls Rectangle's draw method
    }
}

