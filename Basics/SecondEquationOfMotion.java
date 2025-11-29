import java.sql.SQLOutput;
import java.util.Scanner;

public class SecondEquationOfMotion {
    //  s = ut + 1/2at*t
     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of 'u' :");
         int u=sc.nextInt();

         System.out.print("Enter the value of 't' :");
         int t=sc.nextInt();

         System.out.print("Enter the value of 'a' :");
         int a=sc.nextInt();


         System.out.println("Value for 's' is :" + (u*t + (0.5)*a*t*t));

     }
}
