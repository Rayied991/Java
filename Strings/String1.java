package Java.Strings;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        //Strings are immutable and cannot be changed
        //String name=new String("Rayied");
        String name="Rayied";
        System.out.print("The name is: ");
        System.out.println(name);
        int a=6;
        float b=5.645f;
        System.out.printf("The value of a is %d and value of b is %8.2f",a,b);//format specifier
        System.out.format("The value of a is %d and value of b is %.2f",a,b);
        System.out.format("The value of a is %d and value of b is %f",a,b);
        Scanner input=new Scanner(System.in);
        //String st=input.next();
        String str=input.nextLine();
        System.out.println(str);

    }
}
