public class ClassObject {

    static void myMethod(){
        System.out.println("This is static method");
    }
    public void myMethod2(){
        System.out.println("This is public method");
    }
    int x = 5;
    public static void main(String[] args) {
        
        ClassObject myobj = new ClassObject();
        System.out.println(myobj.x);
       
        myMethod();
        myobj.myMethod2();
    }
}
