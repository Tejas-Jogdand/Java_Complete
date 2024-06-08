public class Constructors {

    String name;

    public Constructors(){
        name = "Tejas";
    }
    public Constructors(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Constructors myObj = new Constructors();
        System.out.println(myObj.name);

        Constructors myObj2 = new Constructors("Rohit");
        System.out.println(myObj2.name);
   

    }
}
