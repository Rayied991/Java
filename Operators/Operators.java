package Java.Operators;

public class Operators {
    public static void main(String[] args) {
        //Unary Operator->++ and --

        int x=10;
        System.out.println(x++);//10
        System.out.println(x);//11
        System.out.println(++x);//12
        System.out.println(x--);//12
        System.out.println(x);//11
        System.out.println(--x);//10
        char ch='a';
        System.out.println(ch);//a
        System.out.println(++ch);//b
        System.out.println(ch++);//b
        System.out.println(ch);//c

        //Java Unary Operators :~ and !

        int a=10;
        int b=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~a);//-11(minus of total positive value which starts from 0)
        System.out.println(~b);//9 (positive of total minus,positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true (opposite of boolean value)


        //Arithmetic Operator

        int a1=10;
        int b1=5;
        System.out.println(a1+b1);//15
        System.out.println(a1-b1);//5
        System.out.println(a1*b1);//50
        System.out.println(a1/b1);//2
        System.out.println(a1%b1);//0

        System.out.println(10*10/5+3-1*4/2);
       /* Highest Precedence goes to * and /.They are then evaluated in the basis of
        left to right associativity
                  100/5+3-1*4/2
                  =20+3-1*4/2
                  =20+3-4/2
                  =20+3-2
                  =23-2
                  =21
                */


        //Java Left Shift Operator

        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//2-*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240


        //Java Right Shift Operator
        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2

        //Java AND Operator Example: Logical && and Bitwise &
        //&& if the first condition is found false,then he will not check next condition
        //& if the first condition is found false,then he will check next condition

        int A=10;
        int B=5;
        int C=20;

        System.out.println(A<B && A<C);//false && true=false
        System.out.println(A<B & A<C);//false & true=false
        System.out.println(A<B && A++<C);//false && true=false
        System.out.println(A);//10(not incremented) Because 2nd condition is not checked
        System.out.println(A<B && A++<C);//false & true=false
        System.out.println(A);//11(incremented) because 2nd condition  is checked


    //Java OR Operator Example: logical  ||  and Bitwise |
        // ||->if first condition is true then it will not check the second condition
        //|->if first condition is true/false then it will also check the second condition
        int a3=10;
        int b3=5;
        int c3=20;
        System.out.println(a3>b3 || a3<c3);//true||true=true
        System.out.println(a3>b3 | a3<c3);//true|true=true

        int A1=10;
        int B1=5;
        int C1=20;


        System.out.println(A1>B1 || A1++<C1);//true||true=true
        System.out.println(A1);//10(not incremented) Because 2nd condition is not checked
        System.out.println(A1>B1 | A1++<C1);//true|| true=true
        System.out.println(A1);//11(incremented) because 2nd condition  is checked

        //Java Ternary Operator
        int a4=2;
        int b4=5;
        int min=(a4<b4)?a4:b4;//if (a>b) true then it will print maximum value=5 else 2
        System.out.println(min);

        //Java Assignment Operator
        int a5=10;
        int b5=20;
        a5+=4;//a=a+4(10+4)
        b5-=4;//b=b-4(20-4)
        System.out.println(a5);//14
        System.out.println(b5);//16
        a5*=2;
        System.out.println(a5);//28
        b5/=6;
        System.out.println(b5);//2


        //Java Relational Operator-> <,>,<=,>=,==,!=
        int number=10;
        int number1=20;
        System.out.println(number>number1);//false
        System.out.println(number<number1);//True
        number1=10;
        System.out.println(number<=number1);//true
        System.out.println(number>=number1);//true
        System.out.println(number==number1);//true
        System.out.println(number!=number1);//false
        number=11;
        System.out.println(number!=number1);//true

        // ==->checks the memory are in same address or not

        String name="abc";
        String name2="abc";
        String name3=new String("abc");
        System.out.println(name==name2);//true
        System.out.println(name==name3);//false
        System.out.println(name2==name3);//false


        //.equals->check the contains
        System.out.println(name.equals(name3));//true








    }
}
