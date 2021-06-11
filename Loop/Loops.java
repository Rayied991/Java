public class Loops{
    public static void main(String[] args) {
    //     int i=10;
    //     while(true){
    //          System.out.println(i);
    // }
    // while(false){
    //     System.out.println(i);
    // }
    // for(;;){
    //     System.out.println(i);
    // }
    /*
        In Programming languages, Loops are used to execute a set of instructions/
        functions  repeatedly when some conditions become true.There are Three types of loops in Java.
         */


        //for loop
        for (int i=1;i<=10;i++){
            System.out.println("Person :"+i);
        }
        //Nested for loops
        System.out.println("Right Angle Triangle....");
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //for-each loop
        int number[]={1,2,3,4,5,6,7,8,9};
        for (int i:number){
            System.out.println(i);
        }

        //Infinitive for loop

//        for (;;){
//            System.out.println("Hello");
//        }


        //while loop
        /*
        The Java While loop is used to iterate a part of the program
        several times.if the number of iteration is not fixed,it is recommend to use while loop.
         */
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        int j=1;
        int add=0;
        while (j<=10){
            add=add+j;
            j++;
        }
        System.out.println("The sum of numbers="+add);

        //Infinity loop using While loop


//        while (true){
//            System.out.println("Hello!");
//        }



        //do-while loop
        /*
   do-while loop is used to iterate a part of the program several times.
   if the number of iteration is not fixed and you must have to execute
   the loop at once ,It is recommended to use do-while loop.
 */
        int k=1;
        do {
            System.out.println("Hello");
            k++;

        }while (k<=10);

        //it will give output at least one time
        int k1=1;
        do {
            System.out.println("One Time");
            k1++;

        }while (k1<=0);

        //Infinitive do-While loop
//        do {
//            System.out.println("Hello Infinitive loop");
//        }while (true);
}
}