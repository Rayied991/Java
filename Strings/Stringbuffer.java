package Java.Strings;

public class Stringbuffer {
    public static void main(String[] args) {
        //Java String Bufferclass
        //Stringbuffer changes the orginal String

        String name="Rayied";
        //name6=name6.concat("Hussain");
        // System.out.println(name6);
        //we can  use these effect on stringBuffer easily

        //But in stringBuffer we don't need to store into a string variable to see change effects

        StringBuffer name2=new StringBuffer(name);
        name2.append(" Hussain");
        System.out.println(name2);

        //Stringbuffer insert method
        name2.insert(0,"MD. ");
        System.out.println(name2);

        //Stringbuffer replace method
        name2.replace(0,5,"Hello");
        System.out.println(name2);

        //Stringbuffer Delete Method
        name2.delete(0,3);
        System.out.println(name2);


//        Stringbuffer reverse method
        name2.reverse();
        System.out.println(name2);

        String surname="Alex";
        StringBuffer ex=new StringBuffer(surname);
        ex.reverse();
        String rev=ex.toString();
        System.out.println(rev);
//        The capacity() method returns the current capacity.
//        Change the default capacity of the StringBuffer Object in Java
        StringBuffer n=new StringBuffer();
        //default 16
        System.out.println("Orginal Capacity:"+n.capacity());
        n.append("Hello");
        //Now 16
        System.out.println("After appending Capacity ="+n.capacity());
        n.append("Hello Welcome to Bangladesh");
        //Now capacity is exceding
        //now (16*2)+2=34;  (oldcapacity*2)+2
        System.out.println("Updated Capacity="+n.capacity());

        StringBuffer in=new StringBuffer("Rayied");
        System.out.println(in);
        System.out.println("Original Capacity:"+in.capacity());///22
        in.ensureCapacity(29);//(twice of old capacity+2) argument is greater
        System.out.println("New Capacity="+in.capacity());
        System.out.println();
        StringBuffer str=new StringBuffer("Hi");
        System.out.println(str);
        System.out.println("Orginal Capacity="+str.capacity());//18
        str.ensureCapacity(40);//the minimum capacity argument is greater
        System.out.println("New Capacity="+str.capacity());

//        Set the capacity value for a StringBuffer object in Java
        StringBuffer b = new StringBuffer(100);
        System.out.println("Capacity for the StringBuffer Object = " + b.capacity());
        b = new StringBuffer(" ");
        // returns the current capacity of the String buffer which is 16 + 1
        System.out.println("Capacity for the StringBuffer Object = " + b.capacity());




    }
}
