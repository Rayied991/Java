package Java.Annotation;

import java.util.ArrayList;

/*
Resolves 2 things->
1.check compile time stuffs
2.same name as previous name
3.make sure that it will become comment for other programmers
 */
@FunctionalInterface //compile time error giving 2 methods as I has mentioned functionalinterface
interface  ABC{
    void show();
   // void u();
}
class A{

    public void showdataFromLastYearDataBase(){//2
        System.out.println("Inside A");

    }
}
class B extends  A{
    @Deprecated //This method is available for me but don't use
    public void show(){

    }
    @Override //Annotation
    @SuppressWarnings("Unchecked")
    public void showdataFromLastYearDataBase(){//2
        ArrayList obj=new ArrayList();
        System.out.println("Inside B");

    }

}
public class Annotation1 {
    public static void main(String[] args) {


     B obj=new B();
     obj.showdataFromLastYearDataBase();
    }
}
