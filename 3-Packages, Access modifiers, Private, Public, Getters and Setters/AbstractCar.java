abstract class Car{

    abstract void FuelType();
    
    public void color(){
        System.out.println("Black");
    }

}

class Bugati extends Car{
    public void FuelType(){
        System.out.println("Petrol");
    }
}

public class AbstractCar {
    public static void main(String [] args){
        Bugati b = new Bugati();
        b.FuelType();
        b.color();
    }
}
