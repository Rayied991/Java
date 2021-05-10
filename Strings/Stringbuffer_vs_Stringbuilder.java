package Java.Strings;

public class Stringbuffer_vs_Stringbuilder {
    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();
        StringBuffer sb=new StringBuffer("Java");
        for (int i=0;i<=1000000;i++){
            sb.append("Hello");
        }
        System.out.println("Time taken to execute StringBuffer:"+(System.currentTimeMillis()-starttime)+" ms");


         starttime=System.currentTimeMillis();
        StringBuilder sb1=new StringBuilder("Java");
        for (int i=0;i<=1000000;i++){
            sb1.append("Hello");
        }
        System.out.println("Time taken to execute StringBuilder:"+(System.currentTimeMillis()-starttime)+" ms");
    }
}
