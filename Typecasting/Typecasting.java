package Java.Typecasting;

public class Typecasting {
    public static void main(String[] args) {
        byte num=10;
        int num1=num;
        System.out.println(num1);

        int num2=10;
      //  byte num3=num2;//without typecasting error occurs
        byte num3=(byte)num2;//typecasted
        System.out.println(num3);

        int number=10;
        float number2=number;
        System.out.println(number2);//10.0

        float number1=10.2f;
        int x=(int)number1;
        System.out.println(x);


        float num5=34.6666f;
        double num6=12.3434345;
        num5=(float) num6;
        System.out.println(num5);

        int nss=(int)num6;
        System.out.println(nss);


        byte n1=10;
        byte n2=20;
        byte ans=(byte) (n1+n2);
        System.out.println(ans);
    }
}
