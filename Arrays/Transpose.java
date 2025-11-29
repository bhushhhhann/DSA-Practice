package Arrays2D;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int r=sc.nextInt();
        System.out.println("Enter number of Columns");
        int c=sc.nextInt();
        int[][] array = new int[r][c];

        System.out.println("Enter the matrix values :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 array[i][j]=sc.nextInt();
            }
        }
        transpose(r,c,array);
    }
    static void transpose(int r,int c,int arr[][]){
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }
        for(int i=0;i<r;i++){
            System.out.print("\n");
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
        }

    }
}
