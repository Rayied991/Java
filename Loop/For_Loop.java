package CodeWithHarry.Loops;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        //For Loops
        /*
        Syntax:
           for(initialization;check boolean expression;update){
           //code Here
           }

         */

        //A for loop usually used to execute a piece of code for specific   number of times

        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        //Infinitive for loop
        //Way-1
//        for(;;){
//            System.out.println("Hello World");
//        }
//        Way-2
//        for(int i=1;true;i++){
//            System.out.println("Hello World");
//        }

        //way-3
//        for(int i=5;i>0;i++){
//            System.out.println(i);
//        }


        //2n=Even Numbers
        //2n+1=Odd Numbers

        //Write a program  to print first n odd numbers using a for loop
        System.out.println("How many odd Numbers you want to print:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();


        for(int i=1;i<=(2*n+1);i++){
            System.out.println("Odd Numbers : "+i);

        }

        //Decrementing For loop
        for(int i=5;i>0;i--){
            System.out.println(i);
        }


    }
}
