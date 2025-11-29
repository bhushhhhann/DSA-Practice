import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value in Kilometers");
        float a = sc.nextFloat();
        float miles= a*0.62137119f;
        System.out.println("Value in Miles is:"+miles);
    }
}
