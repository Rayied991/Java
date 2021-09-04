import  java.util.Scanner;
public class While_Loop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //not a good way to print
//        System.out.println(3);
//        System.out.println(2);
//        System.out.println(2);



//        System.out.println("Enter a number:");
//      int i=input.nextInt();
//       System.out.println("end point:");
//        int p=input.nextInt();
//       while (i<=p){
//            System.out.println(i);
//            i++;
//
//        }
//        System.out.println("Finish Running While Loop");

        //Infinite While Loop
//        while(true){
//            System.out.println("Infinite While Loop");
//        }


        //Wrong in Java; But correct in C/C++
//        while(1){
//            System.out.println("Infinite While Loop");
//        }

        int arr[]=new int[5];
        for( int i=0;i<5;i++){
            arr[i]=input.nextInt();
            if(arr[i]==42){
                break;
            }

        }
        for( int i=0;i<5;i++){
            System.out.println(arr[i]);

        }
    }
}
