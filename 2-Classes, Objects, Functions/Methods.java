public class Methods{

    // static void mymethod(String fname, String sname){
    //     System.out.println("My name is "+fname+" "+sname);
    // }

    static String mymethod(String fname, String sname){
        return fname+" "+sname;
    }

    static int add(int a, int b){
        return a+b;
    }

    static int add(int a){
        return a+5;
    }

    static double add(double a, double b){
        return a+b+1000;
    }

    public static void main(String[] args) {
     
        System.out.println("My name is "+mymethod("Tejas","Jogdand"));
        System.out.println("Addition of 3 and 4 : "+add(3,4));
        System.out.println("Addition of 3 and 4 : "+add(6));
        System.out.println("Addition of 3 and 4 : "+add(3.454,4.3543));

    }
}