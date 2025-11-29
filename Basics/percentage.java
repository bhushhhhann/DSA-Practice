import java.util.Scanner;
public class percentage {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks Of Subject 1");
        float s1 = sc.nextFloat();
        System.out.println("Enter Marks Of Subject 2");
        float s2 = sc.nextFloat();
        System.out.println("Enter Marks Of Subject 3");
        float s3 = sc.nextFloat();
        System.out.println("Enter Marks Of Subject 4");
        float s4 = sc.nextFloat();
        System.out.println("Enter Marks Of Subject 5");
        float s5 = sc.nextFloat();

        float percentage = ((s1+s2+s3+s4+s5)/500)*100;
        System.out.println("Percentage:");
        System.out.println(percentage);

    }
}
