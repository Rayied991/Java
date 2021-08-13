package Java.Variables;

public class Variables {
    int data=50;//Instance variable->declared outside main method
    static int m=100;//static variable->declared outside main method
    public static void main(String[] args) {
        /*
         * Datatypes->Primitive and Non primitive Datatypes in java variables are
         * statically typed.(statically typed-> we have to declare variable type) In
         * python its not statically typed. Primitive:
         * int,byte,float,long,double,char,boolean,short
         * 
         * Non-Primitive: Derived fromPrimitive Datatypes
         * 
         */
        /*
         * Variables: A variable is a container that stores a value.The value can be
         * changed during the excecution of the program. datatype varname=(data it
         * stores);
         */
        

        /*
         * Primitive datatypes: 
         * 
         * 
         * Byte-> (Range: -128 to +127) 
         * Takes 1 byte(8 bits)
         * Default value=0
         * 
         * short->value ranges from ((2^16)/2 to ((2^16)/2)-1) 
         * takes 2 bytes(16 bits)
         * Default value=0
         * 
         *  integer-> value ranges from ((2^32)/2 to ((2^32)/2)-1) 
         * Takes 4 bytes(32bits)
         *  Default value=0
         
         *  float-> value ranges from (see docs) 
         * Takes 4 bytes(32 bits) 
         * Default value= 0.0f 
         * 
         *  long-> value ranges from ((2^64)/2 to ((2^64)/2)-1)
         *  Takes 8  bytes(64 bits) 
         * default value=0 6. 
         * 
         * double-> value ranges from(see docs) 
         * Takes 8 bytes(64 bits) 
         * default value=0.00D 
         * 
         * 
         * character-> value ranges from (0 to 65535((2^16-1)) 
         * Takes 2 bytes(16 bits) -> because it supports unicode Default
         * value '\00000'
         * 
         *  
         *  boolean-> value can be true or false 
         * size depends on JVM
         * Default value is false
         * 
         */
        
        
        
     //Variable Naming
        
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
