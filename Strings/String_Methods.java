package Java.Strings;

public class String_Methods {
    public static void main(String[] args) {
        String name="Rayiede";
        //  String a1=new String("Rayied");//String class a1=object
        System.out.println(name);
        //String methods
        int len=name.length();//returns length of String
        System.out.println("The length of the string is = "+len);
        String lower=name.toLowerCase();//returns a string which has all the lowercase characters.converts string to a lower case characters
        System.out.println("Lowercase String= "+lower);
        String upper=name.toUpperCase();//converts string to uppercase character
        System.out.println("Uppercase String= "+upper);
        String nonytrimmed="       Rayied      ";
        System.out.println("Non-Trimmed String = "+nonytrimmed);
        String trimmed=nonytrimmed.trim();//remove all the leading and tracing spaces and returns a new string
        System.out.println("After Trimmed: "+trimmed);
        //Substring with start index
        //String sub=name.substring(0)//its redundant,because if we don't write substring than same value will be returned
        String sub=name.substring(3);//from index 3 to last index will be printed
        System.out.println("Substring= "+sub);

        //Substring with start and end index
        String sub1=name.substring(1,6);//print index 0 to 6(5+1)  and return the string
        System.out.println("Substring= "+sub1);

        //  Replace
        String rep=name.replace('e','a');//where e is found instead of e a will be replaced
        //it takes two characters
        System.out.println("Replaces String= "+rep);
        String rep2=name.replace("ied","aad");//it takes two strings
        System.out.println("Replaced String :"+rep2);
        String rep3=name.replace("e","aax");
        System.out.println("Replaced String= "+rep3);

        boolean start=name.startsWith("Ray");
        System.out.println("Starts with Ray= "+start);
        boolean start1=name.startsWith("Pay");
        System.out.println("Starts with Pay= "+start1);

        boolean end=name.endsWith("iede");
        System.out.println("Ends with iede= "+end);
        boolean end1=name.endsWith("Ray");
        System.out.println("Ends with Ray= "+end1);

        System.out.println(name.charAt(0));//returns character on the position
        System.out.println(name.charAt(2));
        //System.out.println(name.charAt(12));
        int index=name.indexOf("e");//returns first occured index
        System.out.println("Index= "+index);
        System.out.println("Index of ied= "+name.indexOf("ied"));
        System.out.println("Index of ied= "+name.indexOf("xxx"));
        //indexof() with starting  index
        System.out.println("Index of ied start searching from index 1 = "+name.indexOf("ied",1));
        System.out.println("Index of Ra start searching from index 1 = "+name.indexOf("Ra",1));
        ////lastindexof()-->returns last index of given string
        System.out.println("Last index= "+name.lastIndexOf("e"));
        System.out.println("Last index= "+name.lastIndexOf("ede"));
        System.out.println("Last index= "+name.lastIndexOf("ddff"));
        System.out.println("Search ay after index 2 and the result= "+name.lastIndexOf("ay",2));
        //Equals()//check the string equals or not
        boolean equal=name.equals("Rayiede");
        System.out.println("Equal= "+equal);
        boolean eq2=name.equals("Alif");
        System.out.println("Equal= "+eq2);
        //Equalsignorecase()//check the string equals or not by ignoring the cases
        String name1="RAYIED";
        boolean ignorecase=name1.equalsIgnoreCase("raYied");
        System.out.println("Equality= "+ignorecase);
        boolean i1=name1.equalsIgnoreCase("rayied");
        System.out.println("Equality ="+i1);
        System.out.println("Equality ="+name1.equalsIgnoreCase("ALIF"));

        //Escape Sequence Characters
        System.out.println("I am escape sequence \" double quotes");
        System.out.println("I am escape sequence \\ double quotes");// \\=\
        System.out.println("I am escape sequence \n double quotes");
        System.out.println("I am escape sequence\tdouble quotes");

        //toString()
        String n1=new String("Hello Bangladesh");
        System.out.println(n1.toString());
    }
}
