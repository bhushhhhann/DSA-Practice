package Arrays2D;

public class SpiralPrintingMyLogic {
    public static void main(String[] args) {
        int arr[][]={{9,8,7},{6,5,4},{3,2,1},{10,11,12,13}};
        int row=4;
        int col=3;
        spiral(row,col,arr);
    }
    static void spiral(int row,int col,int arr[][]){
        for(int i=0;i<1;i++){
            for(int j=0;j<col;j++){
                System.out.println(arr[i][j]);
                if(j==2){
                    i=1;
                    System.out.println(arr[i][j]);                          //  Wrong code , this can be used only for 3x3 matrix.

                    i=2;
                    System.out.println(arr[i][j]);
                        }
            }
        }
        for(int k=2;k>0;k--){
            for(int a=1;a<=0;a--){
                System.out.println(arr[k][a]);
            }
            for(int b=0;b<=1;b++){
                System.out.println(arr[k][b]);
            }
        }

    }
}