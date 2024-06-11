class A{
    String name;
    public void setName(String name){
        this.name = name;
    }
    public void printName(){
        System.out.println("My name is "+name);
    }
}
public class Keywords {
    public static void main(String[] args) {
        A obj = new A();
        obj.setName("Tejas");
        obj.printName();
    }
}
