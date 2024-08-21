class animal{
    void eat(){
        System.out.println("Eats");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("Barks");
    }
}

class babydog extends dog{
    void cry(){
        System.out.println("Cries");
    }
}

class cat extends animal{
    void meow(){
        System.out.println("Meows");
    }
}

public class inheritAnimal {
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.eat();

        cat c = new cat();
        c.meow();
        c.eat();

        babydog bd = new babydog();
        bd.cry();
        bd.bark();
        bd.eat();
    }
}
