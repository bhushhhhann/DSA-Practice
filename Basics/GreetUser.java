import java.util.Scanner;
public class GreetUser {
    public static void main(String[]args){
        System.out.println("What Is Your Name");
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Hello " +str+ " have a good day !");

    }
}
