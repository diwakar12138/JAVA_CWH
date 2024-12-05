// import java.util.Scanner;
// public class TakingUserInput {
//     public static void main(String[] args){
//         System.out.println("Taking the inputs from the user:");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of a:");
//         int a=sc.nextInt();
//         System.out.println("Enter the value of b:");
//         int b=sc.nextInt();
//         System.out.println("Enter the value of c:");
//         int c=sc.nextInt();
//         int sum=a+b+c;
//         System.out.print("Sum of the numbers is:");
//         System.out.print(sum);
//     }
// }



// import java.util.Scanner;
// public class TakingUserInput {
//     public static void main(String[] args){
//         System.out.println("Taking the inputs from the user:");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of a:");
//         float a=sc.nextFloat();
//         System.out.println("Enter the value of b:");
//         float b=sc.nextFloat();
//         System.out.println("Enter the value of c:");
//         float c=sc.nextFloat();
//         float sum=a+b+c;
//         System.out.print("Sum of the numbers is:");
//         System.out.print(sum);
//     }
// }





// import java.util.Scanner;
// public class TakingUserInput{
//     public static void main(String[] args){
//            System.out.println("Taking the user input");
//            Scanner sc=new Scanner(System.in);
//            boolean b=sc.hasNextInt();
//            System.out.println(b);
//     }
// }



import java.util.Scanner;
public class TakingUserInput{
    public static void main(String[] args){
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        // String str=sc.next();  next is used to input a single word witihout whitespaces
        String str=sc.nextLine();   // nextLine() is used to input words with whitespaces
        System.out.println(str);
        
    }
}