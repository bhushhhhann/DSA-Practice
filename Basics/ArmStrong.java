package lec2;

public class ArmStrong {

    public static void main(String[] args) {
        ArmStrong a = new ArmStrong();
        a.arm(371);
    }
    public static void arm(int a){
        int num=1;
        while(a!=0) {
            num*=(a%10)^3;
            a=a/10;
            }
            if(num==a){
                System.out.println(a+" is ArmStrong Number");
            }else{
                System.out.println("Nothing");}
        }
    }


