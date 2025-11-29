import java.util.Scanner;
public class SumOfnEvenNum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while(i<=n){
            sum = sum + 2*i;
            i++;
        }
        System.out.println(sum);
    }
}
