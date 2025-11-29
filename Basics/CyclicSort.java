// GIVEN - For Arrays that contains elements 1-N where N can be anything or say it would be equal to ArraySize
// ex. if N=5 then elements=1,2,3,4,5 and array size is 5 with index 0,1,2,3,4

// Learned by Kunal Khushwaha YOuTUBE

import java.util.Scanner;

public class CyclicSort {

     void sort(int arr[],int n) {
         int i = 0;
         while (i < n ) {
             if (arr[i] != i + 1) {
                 int correctIndex = arr[i] - 1;             //here in SWAPPING LOGIC we would do :
                 int temp = arr[i];                         // " int temp = arr[i];
                 arr[i] = arr[correctIndex];                //   arr[i] = arr[arr[i] - 1];
                 arr[correctIndex] = temp;                  //   arr[arr[i] - 1] = temp; "
                                                            //  But This is WRONG, in 3rd line we are using changed value of "arr[i]" .
             } else {
                 i++;
             }
         }
     }
    public static void main(String [] arg){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of N : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the" + n + " Elements of Array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        CyclicSort obj =new CyclicSort();
        obj.sort(arr,n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
