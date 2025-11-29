package Arrays2D;
import java.util.Scanner;

public class SpiralPrintingRealLogic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Columns :");
        int col=sc.nextInt();
        System.out.println("Enter Number of Rows :");
        int row=sc.nextInt();
        System.out.println("Enter Matrix Elements :");
        int[][] arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    spiral(row,col,arr);
    }
    static void spiral(int row,int col,int arr[][]){
        int minr=0;
        int maxr=row-1;
        int minc=0;
        int maxc=col-1;
        int count=0;
        int totalelements=row*col;

        while(totalelements>count) {

            for (int i = minc; i <=maxc; i++) {
                System.out.println(arr[minr][i]);
                count++;
            }
            minr++;
            if(totalelements<count) break;
            for(int j = minr;j <=maxr; j++){
                System.out.println(arr[j][maxc]);
                count++;
            }
            maxc--;
            if(totalelements<count) break;
            for(int k=maxc;k>=minc;k--){
                System.out.println(arr[maxr][k]);
                count++;
            }
            maxr--;
            if(totalelements<count) break;
            for(int l=maxr;l>=minr;l--){
                System.out.println(arr[l][minc]);
                count++;
            }
            minc++;

        }
    }
}
