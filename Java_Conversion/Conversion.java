package Java.Java_Conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) throws Exception {
        //Java Conversion

        //Java Convert String to int
        //way-1
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        String numberString=input.nextLine();
        System.out.println(numberString);
        //System.out.println(number+10);//its a String
        int number=Integer.parseInt(numberString);
        System.out.println(number);
        System.out.println("After converting String to integer:"+number+10);//its a integer
         //way-2
        Integer num=Integer.valueOf(numberString);//here Integer is an object
        System.out.print("After converting String to integer:");
        System.out.println(num+10);


        //Java Convert Int to String
       //way-1
        int n1=10;
        String sn=String.valueOf(n1);
        System.out.println(sn);
        System.out.println("After converting int to String:"+sn+"10");//1010->This is a String


        //way-2
        String sn1=Integer.toString(n1);
        System.out.println(sn1);
        System.out.println("After converting int to String:"+sn1+"10");//1010->This is a String

        //Java String to long
      //way-1
        String num1="102545";
        Long l1=Long.parseLong(num1);
        System.out.print("After Converting String to long:");
        System.out.println(l1+1);

        //way-2
        long l2=Long.parseLong(num1);
        System.out.print("After Converting String to long:");
        System.out.println(l2+1);

        //Java Convert long to String
        //way-1
        long l3=102535;
        String lS=Long.toString(l3);
        System.out.println("After converting long to String:"+lS+"2");//1025352->Its a String

        //way-2
        String ls=String.valueOf(l3);
        System.out.println("After converting long to String:"+ls+"2");//1025352->Its a String
       

//        Java String to  float conversion
        //way-1
        String fl="125.5";
        float f1=Float.parseFloat(fl);
        System.out.print("After converting String to float:");
        System.out.println(f1+1);//126.5->float

        //way-2

        Float f2=Float.parseFloat(fl);
        System.out.print("After converting String to float:");
        System.out.println(f2+1);//126.5->float

//        Java Float to String

        //way-1
         float f=125.5f;
         String fl1=Float.toString(f);
        System.out.print("After Converting float to String:");
        System.out.println(fl1+"5"+"456");

        //way-2
        fl1=String.valueOf(f);
        System.out.print("After Converting float to String:");
        System.out.println(fl1+"5"+"345");

        //Java Convert String to Double

        //way-1
        String d="6566565.5545";
        double d1=Double.parseDouble(d);
        System.out.print("After Converting String to Double:");
        System.out.println(d1+5);

        //way-2
        Double d2=Double.parseDouble(d);
        System.out.print("After Converting String to Double:");
        System.out.println(d1+5);

        //Java Double to String

        //way-1
        double d3=12523.552;
        String Ds=Double.toString(d3);
        System.out.print("After Converting double to String:");
        System.out.println(d3+"6");

        //way-2
        Ds=String.valueOf(d3);
        System.out.print("After Converting double to String:");
        System.out.println(d3+"5");


        //Java String to Date

        String sdate="31/12/1998";
        Date date1=new SimpleDateFormat("dd/MM/yy").parse(sdate);
        System.out.print("After Converting String to date:");
        System.out.println(date1);

        //Java Convert Date to String

        Date date= Calendar.getInstance().getTime();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str=df.format(date);
        System.out.print("After Converting Date to String:");
        System.out.println(str);

        //Java Convert String to Char
        String name="Rayied";
//        char ch=name.charAt(0);
//        System.out.println(ch);

       //way-1
        for (int i=0;i<name.length();i++){
            char c=name.charAt(i);
            System.out.println("The value is="+c);

        }
        //way-2

        char[] ch=name.toCharArray();
        for (int i=0;i<name.length();i++){
            System.out.println("Position-"+i+" = "+ch[i]);
        }
        System.out.println(ch);


        //Java convert Char to String

        //way-1
        char c1='A';
        String cs=String.valueOf(c1);
        System.out.print("After Converting Char to String:");
        System.out.println(cs+"man");

        //way-2
        cs=Character.toString(c1);
        System.out.print("After Converting Char to String:");
        System.out.println(cs+"man");



        //Java Convert int to long

        //way-1
        int num2=10;
        long lon=num2;
        System.out.print("After Converting  int to long:");
        System.out.println(lon);

        //way-2

        Long l=Long.valueOf(num2);
        System.out.print("After Converting  int to long:");
        System.out.println(l);

        //way-3
        Long ll=new Long(num2);
        System.out.print("After Converting  int to long:");
        System.out.println(ll);

        //Java convert long to int

        //way-1
        long ln=10252;
        int lni=(int)ln;
        System.out.print("After Converting to long to int:");
        System.out.println(lni);

        //way-2
        Long ln1=12523l;
        int i=ln1.intValue();
        System.out.print("After Converting to long to int:");
        System.out.println(i);

        //Java Convert int to Double
        //way-1
        int i1=102;
        double dd=i1;
        System.out.println("After Converting int to Double="+dd);

        //way-2
        Double dd1=Double.valueOf(i1);
        System.out.println("After Converting int to Double="+dd1);

        //way-3
        Double ddd=(double) i1;
        System.out.println("After Converting int to Double="+ddd);

//        double nsss=1025.4;
//        Double oo=nsss;

        //Java convert double to int

        //way-1
        double d4=10.5;
        int x=(int)d4;
        System.out.println("After converting double to Int="+x);

        //way-2
        Integer i2=Integer.valueOf((int) d4);
        System.out.println("After converting double to Int="+i2);

        //way-3
        Double d5=10.5;
        int j=d5.intValue();
        System.out.println("After converting double to Int="+j);

        //Java Convert char to int

        //way-1
        char ci='1';
        int n=Character.getNumericValue(ci);
//        int n=ci;
        System.out.println("After converting char to int="+n);

        //way-2
        int a=Integer.parseInt(String.valueOf(ci));
        System.out.println("After converting char to int="+a);

        //Java String to boolean

        //way-1
        String st="true";
        boolean c=Boolean.parseBoolean(st);
        System.out.println("After converting to String to boolean:"+c);

        //way-2

        Boolean bool=Boolean.valueOf(st);
        System.out.println("After converting to String to boolean:"+bool);

        //Java Convert boolean to String

        //way-1
        boolean b=true;
        String str1=String.valueOf(b);
        System.out.println("After converting to boolean to String:"+str1);

        //way-2
         str1=Boolean.toString(b);
        System.out.println("After converting to boolean to String:"+str1);

        //Java Convert Binary to Decimal
        String bin="1010";
        int dec=Integer.parseInt(bin,2);
        System.out.println("After converting Binary to Decimal:"+dec);

        //Java convert Decimal to Binary
        int dec2=10;
        String bin2=Integer.toBinaryString(dec2);
        System.out.println("After converting Decimal to Binary:"+bin2);

        //Java Convert Hexa-decimal to Decimal
        String hex="a";
        int dec3=Integer.parseInt(hex,16);
        System.out.println("After converting to hexa-decimal to decimal:"+dec3);

        //Java Convert Decimal to Hexa-decimal
        int dec4=10;
        String hexa=Integer.toHexString(dec4);
        System.out.println("After converting to Decimal to Hexa-decimal:"+hexa);

        //Java convert octal to decimal
         String oc="1212";
         int dec5=Integer.parseInt(oc,8);
        System.out.println("After Converting octal to decimal:"+dec5);

        ///Java Convert Decimal to octal
        int dc=89;
        String oct=Integer.toOctalString(dc);
        System.out.println("After Converting Decimal to Octal:"+oct);

        //Java Convert Binary to Hexa-decimal
        String bin1="1010";
        int dc1=Integer.parseInt(bin1,2);
        String hx=Integer.toHexString(dc1);
        System.out.println("After Converting Binary to Hexa-Decimal="+hx);

        //Java Convert Binary to Octal
        String bn="1010";
        int dc2=Integer.parseInt(bn,2);
        String octal=Integer.toOctalString(dc2);
        System.out.println("After converting Binary to octal:"+octal);

        //Java Convert octal to Binary
        String oct2="1212";
        int dec6=Integer.parseInt(oct2,8);
        String bin3=Integer.toBinaryString(dec6);
        System.out.println("After converting Octal to Binary:"+bin3);

        //Java Convert Hexa-Decimal to Binary
        String hexadecimal="a";
        int dc3=Integer.parseInt(hexadecimal,16);
        String binary=Integer.toBinaryString(dc3);
        System.out.println("After converting Hexa-decimal to Binary:"+binary);
































    }
}
