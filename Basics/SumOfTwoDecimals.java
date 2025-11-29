import java.util.Scanner;
public class SumOfTwoDecimals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        float a = sc.nextFloat();
        System.out.println("Enter your second number");
        float b = sc.nextFloat();
        float sum = a + b;
        System.out.println("The sum of the two number is");
        System.out.println(sum);

    }
}
