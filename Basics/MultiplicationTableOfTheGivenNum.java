import java.util.Scanner;
public class MultiplicationTableOfTheGivenNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the N");
        int n = sc.nextInt();
        int i = 1;
//        while(i<=10){
//            System.out.println(n*i);
//            i++;
        //another type of printing the Table.
        while(i<=10){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
            i++;
        }
    }
}

