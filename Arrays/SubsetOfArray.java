package lec4;
public class SubsetOfArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int maxSum=0;


        // Loop for starting point
        for (int i = 0; i < arr.length; i++) {
            // Loop for ending point
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                for (int k = i; k <= j; k++) {
                    sum+=arr[k];
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }

}
