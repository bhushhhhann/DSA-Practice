package lec4;

public class SwappingArrayElements {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        for(int i=0;i<=a.length/2;i++){
           for(int j=a.length-1;j<a.length/2;j--) {
               int temp =a[i];
               a[i]=a[j];
               a[j]=temp;
           }
        }
        for (int k=0;k<a.length;k++){
        System.out.println(a[k]);}

    }
}
