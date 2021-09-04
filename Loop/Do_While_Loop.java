
public class Do_While_Loop {
    public static void main(String[] args) {
        //While vs Do-While Loop

        //While Loop
//        int a =0;
//        while(a<5){
//            System.out.println(a);//0 1 2 3 4
//            a++;
//        }

        //Do-While Loop-> 1st code excecute then condition check
        //This loop is similar to a while loop except the fact that it is Guaranted to excecute  at least once.
        //If the condition doesn't match at least one time the code will excecute
        int a=10;//the value is not checked for the first time;It goes to loop without checking
        do{
            System.out.println(a);
            a++;

        }while(a<5);




    }
}
