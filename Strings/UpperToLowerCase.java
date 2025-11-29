import java.util.Scanner;

public class UpperToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String in Capital Letters");
        String str = sc.nextLine(); //nextLine is used here to take a sentence as string input.
        String str1 = str.toLowerCase();
        System.out.println(str1);
    }
}
