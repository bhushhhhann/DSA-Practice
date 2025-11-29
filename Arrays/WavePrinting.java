package Arrays2D;
public class WavePrinting {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row=3;
        int col=3;
        wave(row,col,arr);
    }
    static void wave(int row,int col,int arr[][]){
        for(int i=0;i<row;i++){
            if(i%2!=0){
                for(int k=col-1;k>=0;k--){
                    System.out.print(arr[i][k]+" ");
                }
                System.out.println();
            }
            else{
                for(int j=0;j<col;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

