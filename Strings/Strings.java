package Java.Strings;

public class Strings {
    public static void main(String[] args) {
        //Java String
        /*
        In java , String is basically an object that represents sequence of character values.
        An array of characters works same as java String.
         */
        //Strings are immutable and cannot be changed

        //way 1
        char[] ch = {'J','A','V','A'};
        String s=new String(ch);
        System.out.println(s);


        //Way-2
        String language=new String("Python");
        System.out.println(language);

        //Way-3
        String lang="C++";
        System.out.println(lang);

        /*Java String class Provides a lot of methods to perform operations on strings such as compare(),concat(),
          equals(),split(),length(),replace(),compareTo(),intern(),substring() etc.
        */

        String name="Jack";
        char ch1=name.charAt(0);//returns character on position 0
        System.out.println("Index-0:"+ch1);
        System.out.println("Index-1:"+name.charAt(2));//returns character on position 2

        //Length method
       int len=name.length();//returns length
        System.out.println("Length="+len);
        System.out.println(name.charAt(len-1));//position len-1 finding the characters


        //Substring method
        //Substring with start index
        //String sub=name.substring(0)//its redundant,because if we don't write substring than same value will be returned
        String sub=name.substring(3);//from index 3 to last index will be printed
        System.out.println("Substring= "+sub);

        //Substring with start and end index
        String sub1=name.substring(1,2);//print index 1 to 2 and return the string
        System.out.println("Substring= "+sub1);

        //Contains method
        String letter="Hello Java Programming";
        System.out.println(letter.contains("Java"));//returns true/false
        System.out.println(letter.contains("Jack"));//returns true/false
        boolean check=letter.contains("Hello");
        System.out.println("Availability="+check);


        //Equals Method
        String name1="Johny";
        String name2="Jack";
        String name3=new String("JAck");
        System.out.println(name2.equals(name));//true
        System.out.println(name1.equals(name2));//false
        System.out.println(name2.equals(name3));//false

        //equalignorecase method
        boolean c1=name2.equalsIgnoreCase(name3);
        System.out.println(c1);//true

        //concat method
        String fullname=name.concat(" Hello");
        System.out.println(fullname);

        String fname="MD.";
        String surname="Rayied";
        String mname="SHAHZAD HUSSAIN ";
        String Fname=fname.concat(mname).concat(surname);
        System.out.println(Fname);

        //replace method
        String sen="Vscode is a good IDE";
        String repl=sen.replace("good","better");
        String rep1=sen.replace("o","be");
        System.out.println(repl);
        System.out.println(rep1);


        //Split method
        String[] word=sen.split("\\s");
        for(String str:word){
            System.out.println(str);
        }

        //split with limit
        String[] letter2=sen.split("\\s",4);
        for(String str:letter2){
            System.out.println(str);
        }

        //indexof() method->finding out the position
        System.out.println(sen.indexOf("IDE"));
        System.out.println(sen.indexOf("g"));
        System.out.println(sen.indexOf("hello"));



        //finding position with limit
        System.out.println(sen.indexOf("IDE",12));

        //Java String lowercase method
        String n ="hiiiiI";
        String lower=n.toLowerCase();
        System.out.println(lower);


        //Java String uppercase method

        String u="head";
        String upper=u.toUpperCase();
        System.out.println(upper);


        //Java String valueof->converting to string
//        1st way

        int num=10;
        String no=String.valueOf(num);
        System.out.println(no);

        System.out.println(no+10);//1010->This is string now


        boolean in=false;
        String b=String.valueOf(in);
        System.out.println(b);
        System.out.println("Boolean to String:"+(b+11));//false11->which is now String


//        2nd Way->Wrapper class
        String no1=Integer.toString(num);
        System.out.println(no1);
        System.out.println(no1+10);//1010->This is string now







    }
}
