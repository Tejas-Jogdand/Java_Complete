abstract class Shape {
    // Abstract method to be implemented by derived classes
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}


class AreaCalculator {
    // Overloaded methods to calculate area

    // Calculates area of a circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Calculates area of a rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }

    // Calculates area of a triangle
    double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return -1; // Invalid call for non-triangle shape
    }
}


public class Area {
    public static void main(String[] args) {
        // Runtime Polymorphism: Shape hierarchy
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        // Polymorphic call to the draw method
        for (Shape shape : shapes) {
            shape.draw();
        }

        // Compile-Time Polymorphism: AreaCalculator
        AreaCalculator calculator = new AreaCalculator();
        
        System.out.println("Area of Circle: " + calculator.calculateArea(5.0));
        System.out.println("Area of Rectangle: " + calculator.calculateArea(5.0, 10.0));
        System.out.println("Area of Triangle: " + calculator.calculateArea(5.0, 10.0, true));
    }
}
