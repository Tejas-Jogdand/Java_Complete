class second{

    final int x = 5;

    static void myMethod(){
        System.out.println("This is static method");
    }

    public void myMethod2(){
        System.out.println("This is public method");
    }
}

public class Main {
    public static void main(String[] args) {
        second obj = new second();
        System.out.println(obj.x);
        second.myMethod();
        obj.myMethod2();
    }
}
