package Introduction;

public class Operators {
    public static void main(String[] args) {
        int a=5, b=8;
        //Arithmatic Operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //Relational Operator
        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);

        //Assigment operators
        int i = 10;
        i=i+5;
        // i+=6;
        System.out.println(i);

        //Logical operator

        System.out.println(2>3 && 2>5);
        System.out.println(5>3 && 2>5);
        System.out.println(2>3 || 2>5);
        System.out.println(5>3 || 3>5);


        }
}
