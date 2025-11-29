package lec5;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
        int target=40;
        System.out.println(arr[bSearch(target ,arr)]);
    }
    public static int bSearch(int target,int arr[]){
        int s=0;
        int e= arr.length-1;

        while(e>=s){
            int mid=(s+e)/2;

            if(target>arr[mid]){
                s=mid+1;
            }
            if(arr[mid]>target){
                e=mid-1;
            }
            if(arr[mid]==target){
                return mid;
            }
        }
        return -1;

    }
}
