package Java.Strings;

public class Stringbuilder {
    public static void main(String[] args) {
        //Java StringBuilder Class

        //StringBuffer is less efficient than StringBuilder
        //StringBuilder is more efficient than StringBuffer
        //to execute a program in StringBuffer it takes more time than StringBuilder
        //to execute a program in StringBuilder it takes less  time than StringBuffer
        StringBuilder ns=new StringBuilder("Rayied");
        //Append method
        ns.append("Hussain");
        System.out.println(ns);

        //insert method
        ns.insert(0,"MD.");
        System.out.println(ns);

        //replace method
        ns.replace(0,5,"Hello");
        System.out.println(ns);

        //delete method
        ns.delete(0,3);
        System.out.println(ns);

//        reverse mthod
        ns.reverse();
        System.out.println(ns);

        String surname="Asif";
        StringBuilder sb=new StringBuilder(surname);
        sb.reverse();
        System.out.println(sb);
//        System.out.println(sb+10);//not converted to string
        String rev=sb.toString();
        System.out.println(rev);
        System.out.println(rev+10);//converted to string

        //        The capacity() method returns the current capacity.
//        Change the default capacity of the StringBuffer Object in Java
                StringBuilder n=new StringBuilder();
        //default 16
        System.out.println("Orginal Capacity:"+n.capacity());
        n.append("Hello");
        //Now 16
        System.out.println("After appending Capacity ="+n.capacity());
        n.append("Hello Welcome to Bangladesh");
        //Now capacity is exceding
        //now (16*2)+2=34;  (oldcapacity*2)+2
        System.out.println("Updated Capacity="+n.capacity());

        StringBuilder in=new StringBuilder("Rayied");
        System.out.println(in);
        System.out.println("Original Capacity:"+in.capacity());///22
        in.ensureCapacity(29);//(twice of old capacity+2) argument is greater
        System.out.println("New Capacity="+in.capacity());
        System.out.println();
        StringBuilder str=new StringBuilder("Hi");
        System.out.println(str);
        System.out.println("Orginal Capacity="+str.capacity());//18
        str.ensureCapacity(40);//the minimum capacity argument is greater
        System.out.println("New Capacity="+str.capacity());

//        Set the capacity value for a StringBuffer object in Java
        StringBuilder b = new StringBuilder(100);
        System.out.println("Capacity for the StringBuffer Object = " + b.capacity());
        b = new StringBuilder(" ");
        // returns the current capacity of the String buffer which is 16 + 1
        System.out.println("Capacity for the StringBuffer Object = " + b.capacity());

        //StringBuffer compareto() method
        StringBuilder cp=new StringBuilder("Asif");//0 because both are equal
        StringBuilder c2=new StringBuilder("Asif");
        StringBuilder c3=new StringBuilder("asif");
        StringBuilder c4=new StringBuilder("asif Khan");
        int res=cp.compareTo(c2);
        int res2=cp.compareTo(c3);
        int res3=cp.compareTo(c4);
        int res4=c3.compareTo(c4);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

    }
}
