class Animal {
    String name;

    // Base class constructor
    Animal(String name) {
        this.name = name;
    }

    // Method in base class
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    int age;

    // Derived class constructor
    Dog(String name, int age) {
        super(name); // Calls the constructor of the base class
        this.age = age;
    }

    // Overriding method in derived class
    @Override
    void sound() {
        super.sound(); // Calls the sound method of the base class
        System.out.println("Dog barks");
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5);
        dog.displayInfo();
        dog.sound(); // Calls the overridden method in Dog class
    }
}
