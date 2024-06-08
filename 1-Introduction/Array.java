package Introduction;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] names= {"Tejas","Vishal","Shivam"};
        System.out.println(names[2]);

        int[] number = new int[5];
        System.out.println("Array lenght: "+number.length);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array 5 numbers");
        for (int i = 0; i < number.length; i++) {
            number[i]=sc.nextInt();
        }
        System.out.println("Your Array: "+Arrays.toString(number));
    }
}
