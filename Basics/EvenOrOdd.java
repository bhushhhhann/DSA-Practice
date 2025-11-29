package lec2;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        for(int i=0;i<20;i++){
            eRo(i);
        }
    }
    public static void eRo(int i) {
        if (i % 2 == 0) {
            System.out.println(i + " is an Even Num");
        } else {
            System.out.println(i + " is an Odd Num");

        }
    }
}
