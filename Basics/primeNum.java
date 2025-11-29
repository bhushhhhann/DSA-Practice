package lec2;
import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        for (int j=1;j<=50;j++){
            prime(j);
        }
    }
    public static void prime(int a){
        int c=0;
            for(int i=1;i<a;i++){
            if(a%i==0){
                c++;}
            }
        if(c<2){
            System.out.println(a);
        }


    }
}
