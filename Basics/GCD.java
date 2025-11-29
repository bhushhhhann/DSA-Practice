package lec2;

public class GCD {
    public static void main(String[] args) {
        GCD g =new GCD();
        System.out.println( g.gcd(24,36));
    }
    public int gcd(int a,int b){
        int x1=0;
        int x2;
        if(a>b){
            x2=a;
        }else{
            x2=b;
             }

        for(int i=1;i<=x2;i++){
            if(a%i==0 && b%i==0){
                x1=i;
            }
        }
        return x1;
    }
}
