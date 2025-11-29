package Arrays2D;
import java.util.ArrayList;

public class MulOfTwoMatrix {
    public static void main(String[] args) {
        int m1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int product[][]=mul(m1,m2);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.addAll(mul(m1, m2));
        System.out.println(list+"\n");
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(product[i][j]+" ");
//            }
//            System.out.println();
//      }
//    }
    }
    public static ArrayList<ArrayList<Integer>> mul(int m1[][],int m2[][]){
        int row=3;
        int col=3;
        ArrayList<ArrayList<Integer>> l =new ArrayList<>();
//        int product[][] = new int[row][col];
            for (int i = 0; i < row; i++) {
                ArrayList<Integer> ln=new ArrayList<>();
                for (int k = 0; k < col; k++) {
                    int temp = 0;
                    for (int j = 0; j < col; j++) {
                    temp += (m1[i][j] * m2[j][k]);
                }
                    ln.add(temp);
                }
                l.add(ln);

            }
     return l;
//   return product;
    }
}
