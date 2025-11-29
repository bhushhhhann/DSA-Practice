package Arrays2D;

import java.util.Scanner;

// For Rotating an array 90 degree in clockwise manner we have to follow the following steps :
//                                            1 : Transpose the matrix .
//                                            2 : Reverse the columns   .
public class Rotate90Degree {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int r = sc.nextInt();
        System.out.println("Enter number of Columns");
        int c = sc.nextInt();
        int[][] array = new int[r][c];

        System.out.println("Enter the matrix values :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        transpose(r, c, array);

        reverseByCol(r, c, array);

        for (int i = 0; i < r; i++) {
            System.out.print("\n");
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
    static void transpose(int r,int c,int arr[][]) {
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void reverseByCol(int r,int c,int arr[][]){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= c/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][c -1- j];
                arr[i][c -  1-j] = temp;
            }
        }
    }
}
