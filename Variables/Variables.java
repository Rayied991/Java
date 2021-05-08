package Java.Variables;

public class Variables {
    int data=50;//Instance variable->declared outside main method
    static int m=100;//static variable->declared outside main method
    public static void main(String[] args) {
        // int 1Arr;//invalid variables
        //int Arr;//valid variables
        //Variables names are case sensitive
        //variables name should not be  any keyword
        // int void;//error
        // int Void;//valid.but not a  good practice
        //variables spaces are not  allowed
        //int a b c;//not allowed
        //adding 3 numbers


        //local variables->declared inside the main method
        //Accessing local variables
        System.out.print("The sum of these numbers are=");
        int num1=6;
        int num2=5;
        int num3=7;
        int sum=num1+num2+num3;
        System.out.println(sum);
        float f1=10.1f;
        float f2=10.1f;
        float f3=10.1f;
        float sum1=f1+f2+f3;
        System.out.println("Summation is= "+sum1);
        String name="ABC";
        System.out.println(name);
        char Singlealpha='A';
        System.out.println(Singlealpha);
        double no=123.445;
        System.out.println(no);

        //Accessing  instance variables
        Variables vb=new Variables();//for accessing we have to create class object
        System.out.println("Instance Variables="+vb.data);

        //Accessing Static Variables
        //no need to create object
        System.out.println(Variables.m);
        System.out.println(m);

    }
}
